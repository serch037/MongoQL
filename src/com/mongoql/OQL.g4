grammar OQL;
query: selectExpr ';';

selectExpr: 'SELECT' projectionAttributes ','
            fromClause (whereClause)?;
projectionAttributes: projectionList | '*';
projectionList: projection (',' projection)?;
projection: field;
field: ID;
fromClause: 'FROM' ID 'as' ID ',';
expr: orExpr;
orExpr: andExpr ('OR' andExpr)?;
andExpr: equalityExpr ('AND' equalityExpr)?;
equalityExpr: relationalExpr (('!='|'=') relationalExpr);
relationalExpr: postfixExpr (('<'|'<='|'>'|'>=')? postfixExpr);
postfixExpr: ID'.'ID|literal;
literal: BoolLiteral | StringLiteral | NumLiteral;
NumLiteral: [0-9]+;
BoolLiteral: ('TRUE'|'FALSE');
StringLiteral: '"'(CHARACTER)+'"';
whereClause: 'WHERE' expr;
ID : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
CHARACTER: ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' );
