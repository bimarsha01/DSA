package com.example.NEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    static void main(String[] args) {
        int[] nums = {-1, 0, 1, 0, 1, 2, 3, 4};
        int target = 0;
        List<List<Integer>> integers;
        SolutionToFourSum solution = new SolutionToFourSum();
        integers = solution.fourSum(nums, target);

        System.out.println(integers);
    }
}

class SolutionToFourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 4; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j <= nums.length - 3; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(
                                nums[i], nums[j], nums[left], nums[right]
                        ));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }

}

