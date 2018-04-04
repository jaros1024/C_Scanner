package com.compilers.states.otherSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class PipeState extends AbstractState {
    public PipeState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '|'){
            passToken(TokenTable.Identifier.OR_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.BIT_OR_SYM);
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
