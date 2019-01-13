/*Write a program to create a ChessBoard pattern with the help of multidimensional array,
where WWrepresents white color and BB represents Black color.*/
package com.stackroute.PE3;

public class PrintChessBoardPattern {
    public String[] chessBoardPattern() {
        String string = "";
        String[] patternarray = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
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
}
