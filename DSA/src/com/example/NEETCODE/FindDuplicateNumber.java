package com.example.NEETCODE;


public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;


        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        int slow2 = 0;

        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2,3,2,2};

        int result = findDuplicate(nums);

        System.out.println(result);
    }
}
