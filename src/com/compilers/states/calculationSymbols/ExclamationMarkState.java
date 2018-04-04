package com.compilers.states.calculationSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;
import com.compilers.states.UnknownTextState;

public class ExclamationMarkState extends AbstractState {
    public ExclamationMarkState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == '='){
            passToken(TokenTable.Identifier.DIFF_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.EXCLAMATION_SYM);
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
