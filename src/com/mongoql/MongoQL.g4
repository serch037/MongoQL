grammar MongoQL;
query: selectClause
        fromClause
        whereClause
        orderByClause';';
//WS : [ \t\r\n]+ -> skip ;

selectClause: 'SELECT' WS? projAttrs WS?;
projAttrs
    : projList | '*';
projList: nestedField (','  projList)?;
nestedField: field '.' nestedField | field;
field: ID;

fromClause: 'FROM' collection;
collection: ID;

whereClause: ('WHERE' exprList)?;
exprList
    : '(' exprList ')'
    | exprList 'AND' exprList
    | exprList 'OR' exprList
    | expr
    ;
expr: nestedField  RELOP value;
//LOGOP: 'AND' | 'OR';
RELOP: '=' | '!=' | '<' | '<=' | '>' | '>=';
value: NUMBER|BOOLEAN|STRING|nestedField;

orderByClause: ('ORDER BY' orderByFields)?;
orderByFields
    : nestedField (orderByOpt)? ',' orderByFields
    | nestedField (orderByOpt)? ;
orderByOpt: ('ASC'|'DESC');

NUMBER: [0-9]+;
BOOLEAN: ( 'TRUE' | 'FALSE' );
STRING:
    ('"' ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ '"') |
    ('\'' ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ '\'')
;

ID : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
CHARACTER: ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' );
WS: [ \t\n\r]+ -> skip ; // toss out all whitespace
