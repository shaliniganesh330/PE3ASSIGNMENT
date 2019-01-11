package com.PE3;

import java.util.Arrays;

public class CheckConsecutiveNum {
    public String consecutivenumber(int arr[], int n)
    {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] - arr[i - 1] != d)
            {
                return "numbers are not in consecutive series";
            }
            else
            {
                return "Numbers are in a consecutive series";
            }

        }return null;
    }
}




