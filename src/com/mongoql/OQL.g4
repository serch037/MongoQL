grammar OQL;
query: selectExpr;

selectExpr: 'SELECT' projectionAttributes
            fromClause (whereClause)?;
projectionAttributes: projectionList | '*';
projectionList: projection (',' projection)?;
projection: field;
field: ID;
fromClause: 'FROM' iteratorDef (',' iteratorDef)?;
iteratorDef: expr (('as') ID)?;
expr: orExpr;
orExpr: andExpr ('or' andExpr)?;
andExpr: equalityExpr ('and' equalityExpr)?;
equalityExpr: relationalExpr (('!='|'=') relationalExpr);
relationalExpr: postfixExpr (('<'|'<='|'>'|'>=')? postfixExpr);
postfixExpr: primaryExpr('.'ID)?;
primaryExpr: ID|literal |  '(' query ')';
literal: booleanLiteral | stringLiteral;
booleanLiteral: ('TRUE'|'FALSE');
stringLiteral: '"'(CHARACTER)+'"';
whereClause: 'WHERE' expr;
ID : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
CHARACTER: ('a'..'z' | 'A'..'Z' | '0'..'9' | '_');
WS : (' ' | '\t' | '\r' | '\n') {skip();};