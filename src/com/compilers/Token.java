package com.compilers;

public class Token {
    public TokenTable.Identifier name;
    public String text;
    public String color;

    public Token(TokenTable.Identifier name, String text, String color) {
        this.name = name;
        this.text = text;
        this.color = color;
    }
}
