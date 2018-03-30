package com.compilers.states;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.i.IState;

public class InitialState extends AbstractState {

    public InitialState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == ' '){
            passToken(TokenTable.Identifier.SPACE_SYM);
        }
        else if(c == '\n'){
            passToken(TokenTable.Identifier.NEWLINE_SYM);
        }
        else if(c == '{'){
            passToken(TokenTable.Identifier.LBRACE_SYM);
        }
        else if(c == '}'){
            passToken(TokenTable.Identifier.RBRACE_SYM);
        }
        else if(c == '('){
            passToken(TokenTable.Identifier.LBRACKET_SYM);
        }
        else if(c == ')'){
            passToken(TokenTable.Identifier.RBRACKET_SYM);
        }
        else if(c == 'i'){
            scanner.setState(new IState(scanner));
        }
        /*else if(c == '+'){
            scanner.setState(new OnePlusState());
        }*/
        //TODO pozostale znaki
    }
}
