grammar Arithmetic;
exprList : '(' exprList ')'
        | exprList 'AND' exprList
        | exprList 'OR' exprList
        | NUMBER;
NUMBER: [0-9]+;
WS: [ \t\n\r]+ -> skip ; // toss out all whitespace
