lexer grammar TEMLexer;

@header { 
    package base;
}


// Classes
PAGE: 'page';
EXTENDS: 'extends';

CONTROLLER: 'controller';
CONTROLS: 'controls';


// Input Fields
IN: 'in';
TEXT_FIELD: 'TextField';
RADIO: 'Radio';
CHECKBOX: 'Checkbox';
BUTTON: 'Button';

// Output Fields
OUT: 'out';
TEXT: 'Text';
IMAGE: 'Image';


// Types
INT_TYPE: 'int';
BOOL_TYPE: 'bool';
STRING_TYPE: 'string';


// Control Flow
IF: 'if';
WHILE: 'while';


ID: Char+ Digit*;

STRING: '"' ~[\n\r]*? '"';
INTEGER: Digit+;
BOOLEAN: 'true' | 'false';


WS: [\n\r\t ] -> skip;

// Comment Symbol
COMMENT
    : '%' ~[\n]*? '\n'
    | '%%' .*? '%%'
    ;



// Syntax
BRACE_OPEN: '{';
BRACE_CLOSE: '}';
PARANTH_OPEN: '(';
PARANTH_CLOSE: ')';
COMA: ',';
SEMI_COLON: ';';
AT: '@';
COLON: ':';
ASSIGN: '=';

// Boolean comparasion
EQ: '==';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';

// Boolean operators
OR: 'or';
AND: 'and';

// Mathmatic operators
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';


fragment Digit: [0-9];
fragment Char: [a-zA-Z];
