package com.compilers.states.SpecialSymbols;

import com.compilers.Scanner;
import com.compilers.Token;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class FloatingNumberState extends AbstractState {
    private String text;

    public FloatingNumberState(Scanner scanner, String text) {
        super(scanner);
        this.text = text;
    }

    @Override
    public void nextChar(char c) {
            if(c >= '0' && c <= '9') {
                text = text + c;
            }
            else{
                passToken(new Token(TokenTable.Identifier.NUMBER, text, "grey"));
                scanner.setState(new InitialState(scanner), c);
            }
    }
}
