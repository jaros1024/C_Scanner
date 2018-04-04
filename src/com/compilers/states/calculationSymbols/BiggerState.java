package com.compilers.states.calculationSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class BiggerState extends AbstractState {
    public BiggerState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '='){
            passToken(TokenTable.Identifier.BIGGEREQUAL_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.BIGGER_SYM);
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
