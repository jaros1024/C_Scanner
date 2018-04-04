package com.compilers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputSaver {
    private PrintWriter out;
    private boolean singleLineComment = false;
    private boolean multiLineComment = false;

    public void open(String filename){
        try {
            out = new PrintWriter(filename);
            out.print("<html><head></head><body>");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveToken(Token token){
        System.out.println(token.text);
        if(singleLineComment || multiLineComment){
            if(singleLineComment && token.name == TokenTable.Identifier.NEWLINE_SYM){
                out.print("</font>");
                out.println("<br/>");
                singleLineComment = false;
            }
            else if(multiLineComment && token.name == TokenTable.Identifier.END_COMM_SYM){
                out.print(token.text);
                out.print("</font>");
                multiLineComment = false;
            }
            else {
                out.print(token.text);
            }
        }
        else {
            if (token.name == TokenTable.Identifier.SINGLE_COMM_SYM) {
                out.print("<font color=\"green\">");
                out.print(token.text);
                singleLineComment = true;
            }
            else if(token.name == TokenTable.Identifier.BEGIN_COMM_SYM){
                out.print("<font color=\"green\">");
                out.print(token.text);
                multiLineComment = true;
            }
            else if (token.name == TokenTable.Identifier.NEWLINE_SYM) {
                out.println("<br/>");
            }
            else if (token.name == TokenTable.Identifier.SPACE_SYM) {
                out.print("&nbsp;");
            }
            else {
                out.print("<font color=\"" + token.color + "\">");
                out.print(token.text);
                out.print("</font>");
            }
        }
    }

    public void close(){
        out.println("</body></html>");
        out.close();
    }
}
