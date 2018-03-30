package com.compilers.states.i;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class IntState extends AbstractState {

    public IntState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == ' '){
            passToken(TokenTable.Identifier.INT_SYM);
            passToken(TokenTable.Identifier.SPACE_SYM);
            scanner.setState(new InitialState(scanner));
        }
    }
}
