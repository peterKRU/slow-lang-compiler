lexer grammar SlowLangV1Lexer;

// Keywords
CLASS  : 'class';
MAIN   : 'main';
IF     : 'if';
ELSE   : 'else';
WHILE  : 'while';
RETURN : 'return';
NEW    : 'new';
INT_TYPE  : 'int';
FLOAT_TYPE: 'float';
STRING_TYPE: 'string';

//Terminals
INT      : [0-9]+;
FLOAT    : [0-9]+ '.' [0-9]+;
STRING   : '"' .*? '"';
ID       : [a-zA-Z][a-zA-Z0-9]*;

//Ignore Tokens
WS       : [ \t\r\n]+ -> skip;

// Operators
ASSIGN  : '=';
OR      : '||';
AND     : '&&';
EQ      : '==';
NE      : '!=';
LT      : '<';
GT      : '>';
LE      : '<=';
GE      : '>=';
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
MOD     : '%';
NOT     : '!';
BIT_NOT : '~';
INCR    : '++';
DECR    : '--';

// Separators
LPAREN  : '(';
RPAREN  : ')';
LBRACE  : '{';
RBRACE  : '}';
LBRACK  : '[';
RBRACK  : ']';
SEMI    : ';';
COMMA   : ',';
DOT     : '.';
