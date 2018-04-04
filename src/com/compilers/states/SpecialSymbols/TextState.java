package com.compilers.states.SpecialSymbols;

import com.compilers.Scanner;
import com.compilers.Token;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class TextState extends AbstractState {
    private String text;

    public TextState(Scanner scanner, String tmp) {
        super(scanner);
        text = tmp;
    }


    @Override
    public void nextChar(char c) {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            text = text + c;
        }
        else{
            TokenTable.Identifier identifier = scanner.getTokenTable().getTokenByText(text);
            if (identifier == TokenTable.Identifier.ERROR_SYM){
                passToken(new Token(TokenTable.Identifier.VARIABLE, text, "grey"));
            }
            else{
                passToken(identifier);
            }
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
