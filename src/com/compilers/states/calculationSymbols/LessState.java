package com.compilers.states.calculationSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class LessState extends AbstractState {
    public LessState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '='){
            passToken(TokenTable.Identifier.LESSEQUAL_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.LESS_SYM);
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
