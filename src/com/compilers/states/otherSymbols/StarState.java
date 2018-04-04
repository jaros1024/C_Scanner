package com.compilers.states.otherSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class StarState extends AbstractState {
    public StarState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '/'){
            passToken(TokenTable.Identifier.END_COMM_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.STAR_SYM);
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
