package com.compilers.states.i;

import com.compilers.Scanner;
import com.compilers.states.AbstractState;

public class InState extends AbstractState {

    public InState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == 't'){
            scanner.setState(new IntState(scanner));
        }
    }
}
