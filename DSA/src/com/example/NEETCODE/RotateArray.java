package com.example.NEETCODE;

import java.util.Arrays;

public class RotateArray {

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;

        rotateRight(arr, k);

//        System.out.println(Arrays.toString(finalArray));
    }

    public static void rotateRight(int[] arr, int rotations) {

        int length = arr.length;

        int k = rotations % length;

        rotate(arr , 0 , length-1);
        rotate(arr ,  0 , k-1);
        rotate(arr , k , length-1);

        for(int i = 0;i<=length-1;i++){
            System.out.println(arr[i]);
        }

    }
    public static void rotate(int[] arr , int a , int b){
        int length = b;

        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}


