package com.compilers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputSaver {
    private PrintWriter out;

    public void open(String filename){
        try {
            out = new PrintWriter(filename);
            out.print("<html><head></head><body>");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveToken(Token token){
        if(token.name == TokenTable.Identifier.NEWLINE_SYM){
            out.println("<br/>");
        }
        else if(token.name == TokenTable.Identifier.SPACE_SYM){
            out.print("&nbsp;");
        }
        else {
            out.print("<font color=\"" + token.color + "\">");
            out.print(token.text);
            out.print("</font>");
        }
    }

    public void close(){
        out.println("</body></html>");
        out.close();
    }
}
