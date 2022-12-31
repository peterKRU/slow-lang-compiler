parser grammar SlowLangV1Parser;
options { tokenVocab=SlowLangV1Lexer; }

program
  :  mainExecBlock? classDecl* EOF
  ;

mainExecBlock
  :  MAIN LBRACE block RBRACE
  ;

classDecl
  :  CLASS ID LBRACE classBody RBRACE
  ;

classBody
  :  (fieldDecl | methodDecl)*
  ;

fieldDecl
  :  type ID ';'
  ;

methodDecl
  :  type ID '(' formalParams ')' '{' block '}'
  ;

formalParams
  :  (type ID (',' type ID)*)?
  ;

block
  :  statement*
  ;

statement
  :  ifStatement
  |  whileStatement
  |  returnStatement
  |  expression ';'
  |  ';'
  |  '{' block '}'
  ;

ifStatement
  :  'if' '(' expression ')' statement ('else' statement)?
  ;

whileStatement
  :  'while' '(' expression ')' statement
  ;

returnStatement
  :  'return' expression ';'
  ;

expression
  :  logicalOrExpr
  |  assignmentExpr
  |  objectMethodCall
  |  functionCall
  ;

logicalOrExpr
  :  logicalAndExpr ('||' logicalAndExpr)*
  ;

logicalAndExpr
  :  equalityExpr ('&&' equalityExpr)*
  ;

equalityExpr
  :  relationalExpr (('==' | '!=') relationalExpr)*
  ;

relationalExpr
  :  additiveExpr (('<' | '>' | '<=' | '>=') additiveExpr)*
  ;

additiveExpr
  :  multiplicativeExpr (('+' | '-') multiplicativeExpr)*
  ;

multiplicativeExpr
  :  unaryExpr (('*' | '/' | '%') unaryExpr)*
  ;

unaryExpr
  :  ('+' | '-' | '!' | '~') unaryExpr
  |  primaryExpr
  ;

assignmentExpr
  :  primaryExpr '=' expression
  ;

objectMethodCall
  :  primaryExpr '.' ID '(' (expression (',' expression)*)? ')'
  ;

functionCall
  :  ID '(' (expression (',' expression)*)? ')'
  ;

primaryExpr
  :  INT
  |  FLOAT
  |  STRING
  |  ID
  |  objectCreation
  |  '(' expression ')'
  |  prefixIncrDerc
  |  postfixIncrDerc
  ;

prefixIncrDerc
  :  (INCR | DECR) ID
  ;

postfixIncrDerc
  :  ID (INCR | DECR)
  ;

objectCreation
  :  'new' ID '(' (expression (',' expression)*)? ')'
  ;
type
  :  INT_TYPE
  |  FLOAT_TYPE
  |  STRING_TYPE
  |  ID
  ;
