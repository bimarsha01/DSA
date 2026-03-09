package com.example.NEETCODE;

import java.util.Arrays;

public class MoveZeros {
    static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] finalOp = answer(arr);
        System.out.println(Arrays.toString(finalOp));
    }

    public static int[] answer(int[] arr){
        int j = 1;
        int i = 0;
        while(j<=arr.length-1){
            if(arr[i]!=0){
                i++;
                j++;
            }
            else if(arr[j] == 0){
                j++;
            }
            else if(arr[i] == 0 && arr[j] !=0){
                findMissingPositive.swap(i, j, arr);
                i++;
                j++;
            }
        }
        return arr;
    }

}
