package com.compilers.states.i;

import com.compilers.Scanner;
import com.compilers.states.AbstractState;
import com.compilers.states.UnknownTextState;

public class IState extends AbstractState {

    public IState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == 'n'){
            scanner.setState(new InState(scanner));
        }
        else {
            scanner.setState(new UnknownTextState(scanner));
        }
    }
}
