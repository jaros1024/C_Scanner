package com.compilers.states.calculationSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class PlusState extends AbstractState {
    public PlusState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '+'){
            passToken(TokenTable.Identifier.INCREM_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.PLUS_SYM);
            scanner.setState(new InitialState(scanner), c);
        }


    }
}
