package com.compilers.states;

import com.compilers.Scanner;

public class UnknownTextState extends AbstractState {
    private String text;
    public UnknownTextState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {

    }
}
