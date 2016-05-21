lexer grammar QMTemplateLexer;

LEFT_BRACE:  '{' -> pushMode(BLOCK);
PLANE_TEXT: (~[\{\}] | ESC)+;
ESC
    : '\\' LEFT_BRACE
    | '\\' RIGHT_BRACE
    | '\\"'
    | '\\\\'
    | '\\';

mode BLOCK;
RIGHT_BRACE:  '}' -> popMode;
RIGHT_BRACKET:  ')' ;
LEFT_BRACKET:  '(' ;
RIGHT_SQUARE_BRACKET:  ']' ;
LEFT_SQUARE_BRACKET:  '[' ;
DOT:  '.' ;
EQUAL:  '=' ;
DEQUAL:  '==' ;
NOT_EQUAL:  '!=' ;
NOT:  '!' ;
AND:  '&' ;
DAND:  '&&' ;
OR:  '|' ;
DOR:  '||' ;
NEW_LINE: '\n';
EACH:  'each' ;
END: '/end';
IF:  'if' ;
ELSE: 'else';
IN:  'in' ;
GT:  '>' ;
LT:  '<' ;
GTE:  '>=' ;
LTE:  '<=' ;
COMMA:  ',' ;
FLOAT:  [0-9]+ DOT [0-9]+ ;
INT:  [0-9]+ ;
STRING :  '"' ( STRING_ESC | . )*? '"';
BOOLEAN: 'true' | 'false';
fragment STRING_ESC : '\\"' | '\\\\' ;
ID: [A-Za-z][A-Za-z0-9]+;
WS : (' ' |'\t' |'\n' |'\r' )+ -> skip;