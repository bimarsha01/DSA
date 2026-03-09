package com.example.NEETCODE;

import java.util.Arrays;

public class TwoIntegerSumII {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 10, 12};
        int target = 16;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println(Arrays.toString(
                        new int[]{left + 1, right + 1}
                ));
                return;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
