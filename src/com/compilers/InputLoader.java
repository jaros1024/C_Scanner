package com.compilers;

import java.io.*;

public class InputLoader {
    private BufferedReader reader;
    private char character;
    private boolean hasMore = true;

    public void open(String fileName){
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean hasMore(){
        int r;
        try {
            r = reader.read();
            if(r != -1){
                character = (char)r;
                return true;
            }
            hasMore = false;
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public char nextChar(){
        if(hasMore){
            return character;
        }
        return (char)0;
    }
}
