package com.compilers.states;

import com.compilers.Scanner;
import com.compilers.Token;
import com.compilers.TokenTable;

public abstract class AbstractState {
    protected Scanner scanner;

    public AbstractState(Scanner scanner){
        this.scanner = scanner;
    }

    protected void passToken(TokenTable.Identifier identifier){
        scanner.passToken(scanner.getTokenTable().get(identifier));
    }

    protected void passToken(Token token){
        scanner.passToken(token);
    }

    public abstract void nextChar(char c);
}
