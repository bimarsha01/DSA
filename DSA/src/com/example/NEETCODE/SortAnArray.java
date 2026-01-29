package com.example.NEETCODE;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArray {
    // 1. main must take String[] args
    public static void main(String[] args) {
        int[] arr = { 0 , 1 , 0 , 2 , 0 , 0 };
        int[] sortedArr = sortArray(arr);

        System.out.println(Arrays.toString(sortedArr));
    }
    public static int[] sortArray(int[] input) {
        int left = 0;
        int right = input.length-1;
        int mid = left + right;

        mergeSort(input , left , mid);
        java.util.Arrays.sort(input);
        return input;
    }

    private static void mergeSort(int[] input, int left, int right) {
        if(left < right){
            int mid = (left+right)/2;
            mergeSort(input , left , mid);
            mergeSort(input , mid+1 , right);
            merge(input , left , mid , right);
        }

    }

    private static void merge(int[] input , int left , int mid , int right){

        ArrayList<Integer> arrayList = new ArrayList<>();

        int i = left;
        int j = mid+1;

        while(i <= mid && j <= right){

             if(input[i] <= input[j]){
                arrayList.add(input[i]);
                i++;
            }
            else{
                arrayList.add(input[j]);
                j++;
            }

        }

        while(i<=mid){
            arrayList.add(input[i]);
            i++;
        }while(j<=right){
            arrayList.add(input[i]);
            j++;
        }

    }


}