package com.compilers;

public class Main {

    private static final String DEFAULT_OUT_FILE = "out.html";

    public static void main(String[] args) {
        System.out.println("C language scanner is starting...");

        String inputFile = null;
        String outputFile;
        if(args.length == 0){
            System.out.println("No input file provided");
            return;
        }

        inputFile = args[0];
        if(args.length == 1){
            outputFile = DEFAULT_OUT_FILE;
        }
        else {
            outputFile = args[1];
        }

        Scanner scanner = new Scanner(inputFile, outputFile);
        scanner.scan();
        System.out.println("Finished");
    }
}
