package com.compilers.states.calculationSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class AttributionState extends AbstractState {
    public AttributionState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '='){
            passToken(TokenTable.Identifier.EQUALS_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.ATTRIBUTION_SYM);
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
