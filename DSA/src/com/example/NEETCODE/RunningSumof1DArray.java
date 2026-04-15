package com.example.NEETCODE;

import java.util.Arrays;

public class RunningSumof1DArray {

    static void main(String[] args) {
        int[] arr = { 1 ,2, 3, 4};
        int[] finalOp = sumOfArrayWithPrefix(arr);
        System.out.println(Arrays.toString(finalOp));
    }
    public static int[] sumOfArrayWithPrefix(int[] arr){
        int[] prefix = new int[arr.length];

        int i = 1;

        prefix[0] = arr[0];
        while(i < arr.length){
            prefix[i] = prefix[i-1] + arr[i];
            i++;
        }
        return prefix;
    }
}
