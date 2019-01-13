/*Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier, assume the digits are a string and use split()
 */
package com.stackroute.PE3;

import java.util.Arrays;

public class CheckConsecutiveNum {
    public String consecutiveNumber(int arr[], int n) {
        if (arr.length != 0) {
            //Sort arr[]
            Arrays.sort(arr);
            int d = arr[1] - arr[0];
            for (int i = 1; i < n; i++) {
                /*check for consecutive series*/
                if (arr[i] - arr[i - 1] != d) {
                    return "numbers are not in consecutive series";
                } else {
                    return "Numbers are in a consecutive series";
                }
            }
            return null;
        }
        return null;
    }
}



