parser grammar TEMParser;

@header {
    package base;
}

options {
    tokenVocab=TEMLexer;
}

program: ( page | controller)*;

// Page
page: PAGE pageId=ID ( EXTENDS ID (',' ID)* )? pageBody;
pageBody: '{' component* '}';
component
    : in 
    | out 
    | page
    ;


// Components
in: IN ':' inputField '(' fieldId=ID ')' ( '@' eventId=ID )? ';';
inputField
    : TEXT_FIELD 
    | BUTTON 
    | CHECKBOX 
    | RADIO
    ;

out: OUT ':' outputField '(' fieldId=ID ')' ( '<' source=ID )? ';';
outputField
    : TEXT 
    | IMAGE
    ;


// Controller
controller: CONTROLLER controllerId=ID CONTROLS pageId=ID controllerBody;
controllerBody: '{' event* '}';
event: '@' ID '{' block* '}';


// Blocks
block
    : statement 
    | ifBlock 
    | whileBlock 
    ;

ifBlock: IF '(' expression ')' ( block | statement );
whileBlock: WHILE '(' expression ')' block;

statement
    : declare
    | assign
    | call
    ;

declare: type ID ( '=' expression )? ';'; 
assign: ID '=' expression ';';
call: ID '(' expressionList? ')' ';';

type
    : STRING_TYPE
    | INT_TYPE
    | TEXT_FIELD_TYPE
    ;

expression
    : value
    | ID
    | ID '(' expressionList? ')' 
    | expression booleanOperator expression
    ;

expressionList: expression ( ',' expression )*;

value
    : INTEGER
    | STRING
    | BOOLEAN
    ;

booleanOperator: '==' | '<' | '>' | '<=' | '>=';
mathmaticOperator: '+' | '-' | '*' | '/' | '%';