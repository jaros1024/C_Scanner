package com.compilers.states;

import com.compilers.Scanner;
import com.compilers.TokenTable;
import com.compilers.states.SpecialSymbols.IntegerNumberState;
import com.compilers.states.SpecialSymbols.TextState;
import com.compilers.states.calculationSymbols.*;
import com.compilers.states.otherSymbols.AmpersandState;
import com.compilers.states.otherSymbols.PipeState;
import com.compilers.states.otherSymbols.SlashState;
import com.compilers.states.otherSymbols.StarState;

public class InitialState extends AbstractState {

    public InitialState(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void nextChar(char c) {
        if(c == ' '){
            passToken(TokenTable.Identifier.SPACE_SYM);
        }
        else if(c == ';'){
            passToken(TokenTable.Identifier.SEMICOLON_SYM);
        }
        else if(c == '\r'){  }
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
        else if(c == '['){
            passToken(TokenTable.Identifier.LSBRACKET_SYM);
        }
        else if(c == ']'){
            passToken(TokenTable.Identifier.RSBRACKET_SYM);
        }
        else if(c == '+'){
            scanner.setState(new PlusState(scanner));
        }
        else if(c == '-'){
            scanner.setState(new MinusState(scanner));
        }
        else if(c == '*'){
            scanner.setState(new StarState(scanner));
        }
        else if(c == '/'){
            scanner.setState(new SlashState(scanner));
        }
        else if(c == '%'){
            passToken(TokenTable.Identifier.PERCENT_SYM);
        }
        else if(c == '='){
            scanner.setState(new AttributionState(scanner));
        }
        else if(c == '>'){
            scanner.setState(new BiggerState(scanner));
        }
        else if(c == '<'){
            scanner.setState(new LessState(scanner));
        }
        else if(c == '!'){
            scanner.setState(new ExclamationMarkState(scanner));
        }
        else if(c == '&'){
            scanner.setState(new AmpersandState(scanner));
        }
        else if(c == '.'){
            passToken(TokenTable.Identifier.DOT_SYM);
        }
        else if(c == '|'){
            scanner.setState(new PipeState(scanner));
        }
        else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            scanner.setState(new TextState(scanner, ""+c));
        }
        else if((c >= '0' && c <= '9')) {
            scanner.setState(new IntegerNumberState(scanner, ""+c));
        }
        else{
            passToken(TokenTable.Identifier.ERROR_SYM);
        }
    }
}
