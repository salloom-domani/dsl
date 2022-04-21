lexer grammar TEMLexer;

@header { 
    package base;
}


// Classes
PAGE: 'Page';
EXTENDS: 'extends';

CONTROLLER: 'Controller';
CONTROLS: 'controls';


// Input Fields
IN: 'in';
TEXT_FIELD: 'textField';
RADIO: 'radio';
CHECKBOX: 'checkbox';
BUTTON: 'button';

// Output Fields
OUT: 'out';
TEXT: 'text';
IMAGE: 'image';


// Types
INT_TYPE: 'int';
BOOL_TYPE: 'bool';
STRING_TYPE: 'string';
TEXT_FIELD_TYPE: 'TextField';


// Control Flow
IF: 'if';
WHILE: 'while';


ID: Char+ Digit*;

STRING: '"' ~[\n\r]*? '"';
INTEGER: Digit+;
BOOLEAN: 'true' | 'false';


WS: [\n\r\t ] -> skip;


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
MOD: '%';


fragment Digit: [0-9];
fragment Char: [a-zA-Z];
