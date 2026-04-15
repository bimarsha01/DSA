package com.example.NEETCODE;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    static void main(String[] args) {
        int[] arr = { 1,2,3,4};
        int k = 2;
        int x = 10;
        List<Integer> list = new ArrayList<>();
        list = kClosestElement(arr , k , x);
        System.out.println(list);
    }
    public static List<Integer> kClosestElement(int[] arr , int k , int x){
        int left = 0;
        int right = arr.length-1;
        int windowSize = arr.length;
        List<Integer> list = new ArrayList<>();
        while(windowSize > k){
            int a = Math.abs(arr[left] - x);
            int b = Math.abs(arr[right] - x);
            if(a < b){
                right--;
            }
            else if(a > b){
                left++;
            }
            else if(a==b){
                if(arr[left] < arr[right]){
                    right--;
                }
                else{
                    left++;
                }
            }
            windowSize--;
        }

        for (int i = left ; i<= right ; i++){
            list.add(arr[i]);
        }
    return list;
    }
}
