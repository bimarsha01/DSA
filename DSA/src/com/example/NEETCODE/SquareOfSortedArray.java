package com.example.NEETCODE;

import java.util.Arrays;

public class SquareOfSortedArray {
    static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        int[] finalOp = squared(arr);
        System.out.println(Arrays.toString(finalOp));
    }
    public static  int[] squared(int[] arr){

        int n = arr.length;
     int[] result = new int[arr.length];
     int left = 0;
     int right = n-1;
     int pos = n-1;
     while(left<=right){

         int leftSquare = arr[left]*arr[left];
         int rightSquare = arr[right]*arr[right];

         if(leftSquare > rightSquare){
             result[pos] = leftSquare;
             left++;
         }
         else{
             result[pos] = rightSquare;
             right--;
         }
         pos--;
     }
     return result;
    }
}
