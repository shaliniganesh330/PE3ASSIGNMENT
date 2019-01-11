package com.PE3;

import java.util.Scanner;

public class CheckSumOfTheMatrices {
    public int[][] sumofmatrices(int rowsnumber,int columnnumber,int[][]array1,int[][]array2) {
        if ((rowsnumber != 0) || (columnnumber != 0) || (array1.length != 0) || (array2.length != 0)) {
            if (!(array1.length > array2.length)) {
                int sum[][] = new int[rowsnumber][columnnumber];
                System.out.println("Sum of matrices");
                for (int i = 0; i < rowsnumber; i++) {
                    for (int j = 0; j < columnnumber; j++)
                        sum[i][j] = array1[i][j] + array2[i][j];
                }
                for (int i = 0; i < rowsnumber; i++) {
                    for (int j = 0; j < columnnumber; j++) {
                        System.out.print(sum[i][j] + " ");
                    }
                    System.out.println();
                }

                return sum;
            }
            return null;
        }return null;
    }
}

