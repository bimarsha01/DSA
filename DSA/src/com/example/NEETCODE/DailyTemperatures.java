package com.example.NEETCODE;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    static void main(String[] args) {
        int[] arr = { 30,38,30,36,35,40,28};
        int[] finalOp = dailyTemp(arr);
        System.out.println(Arrays.toString(finalOp));
    }
    public static int[] dailyTemp(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return res;
    }
}
