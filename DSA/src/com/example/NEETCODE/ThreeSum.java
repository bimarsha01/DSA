package com.example.NEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static void main(String[] args) {
        int[] nums = {-1, 0, 1, 0};
        List<List<Integer>> integers;
        Solution solution = new Solution();
        integers = solution.threeSum(nums);

        System.out.println(integers);
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        int left ;
        int right ;
        int j = nums.length-1;
        int count = 1;


        while (i+1 < j) {
            left = i + 1;
            right = nums.length - count++;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    if(!result.contains(Arrays.asList(nums[i], nums[left], nums[right]))) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    }
                    break;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            j--;
        }
        return result;
    }
}

