package Lox;

enum TokenType {
    //single-character tokens 
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    //one or two character token
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,
    
    //literals
    IDENTIFIER, STRING, NUMBER,

    //keywords
    AND, CLASS, ELSE, TRUE, FALSE, FUN, FOR, IF, NIL, WHILE, OR, 
    PRINT, RETURN, SUPER, THIS, VAR, 

    EOF
}
