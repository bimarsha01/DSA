package com.example.NEETCODE;

public class FindElementInRotatedArray {
    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1,2,1,1,1,1};
        int target = 2;
        FindElementInRotatedArray obj = new FindElementInRotatedArray();

        boolean result = obj.search(nums , target);

        System.out.println("Minimum element: " + result);
    }

    public boolean search(int[] nums , int target) {

        int left = 0;
        int right = nums.length-1;

        while(left<right){

            int mid = left + (right-left) /2;

            if(nums[mid] >= nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        int pivot = left;
        left = 0;
         right = nums.length-1;
         if(target >=nums[pivot] && target<= nums[right]){
             left = pivot;
         }
         else{
             right = pivot-1;
         }
        while (left <= right) {
            int m = (left + right) / 2;
            if (nums[m] == target) {
                return true;
            } else if (nums[m] < target) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }

        return false;
    }
}
