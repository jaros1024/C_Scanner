package com.compilers.states.otherSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class AmpersandState extends AbstractState {
    public AmpersandState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '&'){
            passToken(TokenTable.Identifier.AND_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.GETADDR_SYM);
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
