package com.compilers;

import java.util.HashMap;
import java.util.Map;

public class TokenTable {
    public enum Identifier {
        SPACE_SYM,
        NEWLINE_SYM,
        LBRACE_SYM,
        RBRACE_SYM,
        LBRACKET_SYM,
        RBRACKET_SYM,
        LSBRACKET_SYM,
        RSBRACKET_SYM,
        PLUS_SYM,
        INCREM_SYM,
        MINUS_SYM,
        DECREM_SYM,
        STAR_SYM,
        SLASH_SYM,
        PERCENT_SYM,
        ATTRIBUTION_SYM,
        EQUALS_SYM,
        BIGGER_SYM,
        BIGGEREQUAL_SYM,
        LESS_SYM,
        LESSEQUAL_SYM,
        DIFF_SYM,
        OR_SYM,
        AND_SYM,
        GETADDR_SYM,
        DOT_SYM,
        ARROW_SYM,
        SEMICOLON_SYM,
        SINGLE_COMM_SYM,
        BEGIN_COMM_SYM,
        END_COMM_SYM,
        BREAK_SYM,
        CASE_SYM,
        CHAR_SYM,
        CONST_SYM,
        CONTINUE_SYM,
        DEFAULT_SYM,
        DO_SYM,
        DOUBLE_SYM,
        ELSE_SYM,
        FLOAT_SYM,
        FOR_SYM,
        IF_SYM,
        INT_SYM,
        LONG_SYM,
        RETURN_SYM,
        SHORT_SYM,
        SIZEOF_SYM,
        STATIC_SYM,
        STRUCT_SYM,
        SWITCH_SYM,
        TYPEDEF_SYM,
        VOID_SYM,
        WHILE_SYM,
        ERROR_SYM,
        EXCLAMATION_SYM,
        BIT_OR_SYM,
        VARIABLE,
        NUMBER;
    }

    private HashMap<Identifier, Token> tokenMap;

    public TokenTable(){
        tokenMap = new HashMap<>();
        tokenMap.put(Identifier.SPACE_SYM, new Token(Identifier.SPACE_SYM, " ", ""));
        tokenMap.put(Identifier.NEWLINE_SYM, new Token(Identifier.NEWLINE_SYM, "\n", ""));
        tokenMap.put(Identifier.LBRACE_SYM, new Token(Identifier.LBRACE_SYM, "{", "black"));
        tokenMap.put(Identifier.RBRACE_SYM, new Token(Identifier.RBRACE_SYM, "}", "black"));
        tokenMap.put(Identifier.LBRACKET_SYM, new Token(Identifier.LBRACKET_SYM, "(", "black"));
        tokenMap.put(Identifier.RBRACKET_SYM, new Token(Identifier.RBRACKET_SYM, ")", "black"));
        tokenMap.put(Identifier.LSBRACKET_SYM, new Token(Identifier.LSBRACKET_SYM, "[", "black"));
        tokenMap.put(Identifier.RSBRACKET_SYM, new Token(Identifier.RSBRACKET_SYM, "]", "black"));
        tokenMap.put(Identifier.PLUS_SYM, new Token(Identifier.PLUS_SYM, "+", "black"));
        tokenMap.put(Identifier.INCREM_SYM, new Token(Identifier.INCREM_SYM, "++", "black"));
        tokenMap.put(Identifier.MINUS_SYM, new Token(Identifier.MINUS_SYM, "-", "black"));
        tokenMap.put(Identifier.DECREM_SYM, new Token(Identifier.DECREM_SYM, "--", "black"));
        tokenMap.put(Identifier.STAR_SYM, new Token(Identifier.STAR_SYM, "*", "black"));
        tokenMap.put(Identifier.SLASH_SYM, new Token(Identifier.SLASH_SYM, "/", "black"));
        tokenMap.put(Identifier.PERCENT_SYM, new Token(Identifier.PERCENT_SYM, "%", "black"));
        tokenMap.put(Identifier.ATTRIBUTION_SYM, new Token(Identifier.ATTRIBUTION_SYM, "=", "black"));
        tokenMap.put(Identifier.EQUALS_SYM, new Token(Identifier.EQUALS_SYM, "==", "black"));
        tokenMap.put(Identifier.BIGGER_SYM, new Token(Identifier.BIGGER_SYM, ">", "black"));
        tokenMap.put(Identifier.BIGGEREQUAL_SYM, new Token(Identifier.BIGGEREQUAL_SYM, ">=", "black"));
        tokenMap.put(Identifier.LESS_SYM, new Token(Identifier.LESS_SYM, "<", "black"));
        tokenMap.put(Identifier.LESSEQUAL_SYM, new Token(Identifier.LESSEQUAL_SYM, "<=", "black"));
        tokenMap.put(Identifier.EXCLAMATION_SYM, new Token(Identifier.EXCLAMATION_SYM, "!", "black"));
        tokenMap.put(Identifier.DIFF_SYM, new Token(Identifier.DIFF_SYM, "!=", "black"));
        tokenMap.put(Identifier.BIT_OR_SYM, new Token(Identifier.BIT_OR_SYM, "|", "black"));
        tokenMap.put(Identifier.OR_SYM, new Token(Identifier.OR_SYM, "||", "black"));
        tokenMap.put(Identifier.AND_SYM, new Token(Identifier.AND_SYM, "&&", "black"));
        tokenMap.put(Identifier.GETADDR_SYM, new Token(Identifier.GETADDR_SYM, "&", "black"));
        tokenMap.put(Identifier.DOT_SYM, new Token(Identifier.DOT_SYM, ".", "black"));
        tokenMap.put(Identifier.ARROW_SYM, new Token(Identifier.ARROW_SYM, "->", "black"));
        tokenMap.put(Identifier.SEMICOLON_SYM, new Token(Identifier.SEMICOLON_SYM, ";", "black"));
        tokenMap.put(Identifier.SINGLE_COMM_SYM, new Token(Identifier.SINGLE_COMM_SYM, "//", "green"));
        tokenMap.put(Identifier.BEGIN_COMM_SYM, new Token(Identifier.BEGIN_COMM_SYM, "/*", "green"));
        tokenMap.put(Identifier.END_COMM_SYM, new Token(Identifier.END_COMM_SYM, "*/", "green"));
        tokenMap.put(Identifier.BREAK_SYM, new Token(Identifier.BREAK_SYM, "break", "blue"));
        tokenMap.put(Identifier.CASE_SYM, new Token(Identifier.CASE_SYM, "case", "blue"));
        tokenMap.put(Identifier.CHAR_SYM, new Token(Identifier.CHAR_SYM, "char", "blue"));
        tokenMap.put(Identifier.CONST_SYM, new Token(Identifier.CONST_SYM, "const", "blue"));
        tokenMap.put(Identifier.CONTINUE_SYM, new Token(Identifier.CONTINUE_SYM, "continue", "blue"));
        tokenMap.put(Identifier.DEFAULT_SYM, new Token(Identifier.DEFAULT_SYM, "default", "blue"));
        tokenMap.put(Identifier.DO_SYM, new Token(Identifier.DO_SYM, "do", "blue"));
        tokenMap.put(Identifier.DOUBLE_SYM, new Token(Identifier.DOUBLE_SYM, "double", "blue"));
        tokenMap.put(Identifier.ELSE_SYM, new Token(Identifier.ELSE_SYM, "else", "blue"));
        tokenMap.put(Identifier.FLOAT_SYM, new Token(Identifier.FLOAT_SYM, "float", "blue"));
        tokenMap.put(Identifier.FOR_SYM, new Token(Identifier.FOR_SYM, "for", "blue"));
        tokenMap.put(Identifier.IF_SYM, new Token(Identifier.IF_SYM, "if", "blue"));
        tokenMap.put(Identifier.INT_SYM, new Token(Identifier.INT_SYM, "int", "blue"));
        tokenMap.put(Identifier.LONG_SYM, new Token(Identifier.LONG_SYM, "long", "blue"));
        tokenMap.put(Identifier.RETURN_SYM, new Token(Identifier.RETURN_SYM, "return", "blue"));
        tokenMap.put(Identifier.SHORT_SYM, new Token(Identifier.SHORT_SYM, "short", "blue"));
        tokenMap.put(Identifier.SIZEOF_SYM, new Token(Identifier.SIZEOF_SYM, "sizeof", "blue"));
        tokenMap.put(Identifier.STATIC_SYM, new Token(Identifier.STATIC_SYM, "static", "blue"));
        tokenMap.put(Identifier.STRUCT_SYM, new Token(Identifier.STRUCT_SYM, "struct", "blue"));
        tokenMap.put(Identifier.SWITCH_SYM, new Token(Identifier.SWITCH_SYM, "switch", "blue"));
        tokenMap.put(Identifier.TYPEDEF_SYM, new Token(Identifier.TYPEDEF_SYM, "typedef", "blue"));
        tokenMap.put(Identifier.VOID_SYM, new Token(Identifier.VOID_SYM, "void", "blue"));
        tokenMap.put(Identifier.WHILE_SYM, new Token(Identifier.WHILE_SYM, "while", "blue"));
        tokenMap.put(Identifier.ERROR_SYM, new Token(Identifier.ERROR_SYM, "ERROR", "red"));
    }

    public Token get(Identifier key){
        return tokenMap.get(key);
    }

    public Identifier getTokenByText(String text) {
        for( Map.Entry<Identifier, Token> elem: tokenMap.entrySet()){
            if( elem.getValue().text.equals(text)) {
                return elem.getKey();
            }
        }
        return Identifier.ERROR_SYM;
    }
}
