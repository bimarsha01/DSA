package com.example.NEETCODE;

import java.util.Map;

public class MinimumSizeSubarraySum {
    static void main(String[] args) {
        int[] arr = { 2,1,5,1,5,3};
        int target = 10;
        int finalOp = countMinimalSumArray(arr , target);
        System.out.println(finalOp);
    }
    public static int countMinimalSumArray(int[] arr , int target){
        int left = 0;
        int right = 0;
        int sum = 0;
        int minCount = Integer.MAX_VALUE;
        while(right < arr.length) {
            sum = sum + arr[right];
            while(sum >= target){
            minCount = Math.min(minCount , (right-left) + 1);
            sum = sum - arr[left];
            left++;
            }
            right++;
        }

        return minCount == Integer.MAX_VALUE ? 0:minCount;
    }
}
