package com.example.NEETCODE;

public class findMin {

    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        int res = nums[0];

        while (l <= r) {


            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = l + (r - l) / 2;


            res = Math.min(res, nums[m]);

            if (nums[m] >= nums[l]) {

                l = m + 1;

            } else {

                r = m - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        findMin solution = new findMin();

        int[] nums = {3, 4, 5, 1, 2};

        int result = solution.findMin(nums);

        System.out.println("Minimum: " + result);
    }
}