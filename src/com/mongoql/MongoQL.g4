grammar MongoQL;
query: selectClause
        fromClause
        (whereClause)?;

selectClause: 'SELECT' WS projAttrs WS ;
projAttrs: projList | '*';
projList: nestedField (',' (WS)? projList)?;
nestedField: field '.' nestedField | field;
field: ID;

fromClause: 'FROM' WS collection;
collection: ID;

whereClause: WS 'WHERE' WS exprList;
exprList: expr (',' (WS)? exprList)?;
expr: field (WS)? operator (WS)? value;
operator: '=' | '!=' | '<' | '<=' | '>' | '>=';
value: STRING | NUMBER | boolean;
boolean: 'TRUE' | 'FALSE';

ID : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
CHARACTER: ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' );
WS : (' ' | '\t' | '\r' | '\n') {skip();};

STRING: ('"' ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ '"');
NUMBER: [0-9]+;
BOOLEAN: ( 'TRUE' | 'FALSE' );