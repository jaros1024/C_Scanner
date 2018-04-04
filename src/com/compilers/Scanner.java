package com.compilers;

import com.compilers.states.AbstractState;
import com.compilers.states.InitialState;

public class Scanner {
    private String inputFileName;
    private String outputFileName;
    private OutputSaver outputSaver;
    private InputLoader inputLoader;
    private AbstractState state;
    private TokenTable tokenTable = new TokenTable();

    public Scanner(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public void scan(){
        loadFiles();
        state = new InitialState(this);

        while(inputLoader.hasMore()){
            state.nextChar(inputLoader.nextChar());
        }

        closeFiles();
    }

    public void passToken(Token token){
        outputSaver.saveToken(token);
    }

    private void loadFiles(){
        inputLoader = new InputLoader();
        inputLoader.open(inputFileName);
        outputSaver = new OutputSaver();
        outputSaver.open(outputFileName);
    }

    private void closeFiles(){
        outputSaver.close();
    }

    public void setState(AbstractState state) {
        this.state = state;
    }
    public void setState(AbstractState state, char c) {
        this.state = state;
        state.nextChar(c);
    }

    public TokenTable getTokenTable() {
        return tokenTable;
    }

}
