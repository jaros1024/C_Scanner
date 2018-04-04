package com.compilers.states.calculationSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class MinusState extends AbstractState {
    public MinusState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '-'){
            passToken(TokenTable.Identifier.DECREM_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else if(c == '>'){
            passToken(TokenTable.Identifier.ARROW_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else{
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
