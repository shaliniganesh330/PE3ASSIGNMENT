package com.PE3;

public class PrintChessBoardPattern {
    public String[] chessboardpattern() {
        String string = "";
        String[] patternarray = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++)
                {
                    if (j % 2 == 0) {
                        string += "WW";
                        string += "|";
                    } else {
                        string += "BB";
                        string += "|";
                    }
                }
                patternarray[i] = string;
                string = "";
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        string += "BB";
                        string += "|";
                    } else {
                        string += "WW";
                        string += "|";
                    }
                }
                patternarray[i] = string;
                string = "";
            }
        }
        return patternarray;
    }
    public static void  main(String[] arg){
        PrintChessBoardPattern chessboard =new PrintChessBoardPattern();
          String[] str;
        str= chessboard.chessboardpattern();
        for(int i=0;i<str.length;i++)
            System.out.println(str[i]);
    }
}
