parser grammar QMTemplateParser;

options{
    language = Java;
    tokenVocab = QMTemplateLexer;
}


template: (originText | renderExpr | ifExpr | eachExpr | eachIndexExpr)+;

originText: PLANE_TEXT;

renderExpr: LEFT_BRACE evlExpr RIGHT_BRACE;

blockEnd:  LEFT_BRACE END RIGHT_BRACE;

evlExpr
    : id
    | evlExpr DOT methodInvoke
    | evlExpr LEFT_SQUARE_BRACKET evlExpr RIGHT_SQUARE_BRACKET
    | evlExpr DOT evlExpr
    | value
    | evlExpr DEQUAL evlExpr
    | evlExpr DAND evlExpr
    | evlExpr DOR evlExpr
    | evlExpr NOT_EQUAL evlExpr
    | NOT evlExpr
    | evlExpr GT evlExpr
    | evlExpr LT evlExpr
    | evlExpr GTE evlExpr
    | evlExpr LTE evlExpr
    | LEFT_BRACKET evlExpr RIGHT_BRACKET;

methodInvoke: (ID LEFT_BRACKET evlExpr (evlExpr COMMA)* RIGHT_BRACKET) | ID LEFT_BRACKET RIGHT_BRACKET;

value: intLiteral | floatLiteral | stringLiteral | booleanLiteral;

intLiteral: INT;

floatLiteral: FLOAT;

stringLiteral: STRING;

ifExpr: LEFT_BRACE ifKey evlExpr RIGHT_BRACE template elseIfExpr* elseExpr? blockEnd;

elseIfExpr: LEFT_BRACE elseIf evlExpr RIGHT_BRACE template;

elseExpr: LEFT_BRACE elseKey RIGHT_BRACE template;

ifKey: IF;

elseIf: elseKey IF;

elseKey: ELSE;

booleanLiteral: BOOLEAN;

eachExpr: LEFT_BRACE each id in evlExpr RIGHT_BRACE template blockEnd;

each: EACH;

id: ID;

in: IN;

eachIndexExpr: LEFT_BRACE each id COMMA id in evlExpr RIGHT_BRACE template blockEnd;
