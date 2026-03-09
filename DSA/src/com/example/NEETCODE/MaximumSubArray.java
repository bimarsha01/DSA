package com.example.NEETCODE;

public class MaximumSubArray {
    static void main(String[] args) {
        int[] arr = {100, -200, 50, 60};
        int finalOp = maxSubArray(arr);
        System.out.println(finalOp);
    }
    public static int maxSubArray(int[] arr){
        int i = 0;
        int currentSum = arr[0];
        int maximumSum = arr[0];

        for (i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maximumSum = Math.max(maximumSum, currentSum);
        }
        return maximumSum;
    }
}
