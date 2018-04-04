package com.compilers.states.otherSymbols;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class SlashState extends AbstractState {
    public SlashState(Scanner scanner) {
        super(scanner);
    }
    @Override
    public void nextChar(char c) {
        if(c == '/'){
            passToken(TokenTable.Identifier.SINGLE_COMM_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else if(c == '*'){
            passToken(TokenTable.Identifier.BEGIN_COMM_SYM);
            scanner.setState(new InitialState(scanner));
        }
        else {
            passToken(TokenTable.Identifier.SLASH_SYM);
            scanner.setState(new InitialState(scanner), c);
        }
    }
}
