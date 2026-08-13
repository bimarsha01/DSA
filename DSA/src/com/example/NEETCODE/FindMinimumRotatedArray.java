package com.example.NEETCODE;

public class FindMinimumRotatedArray {

    public static void main(String[] args) {

        int[] nums = {9,-5,-2,0,3};
        FindMinimumRotatedArray obj = new FindMinimumRotatedArray();

        int result = obj.findMin(nums);

        System.out.println("Minimum element: " + result);
    }

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int smallestElement = 0;

        while(left<=right){

            int mid = left + (right-left) /2;

            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else if(nums[mid] < nums[right]){
                right = mid ;
            }
            else{
                smallestElement = nums[mid];
                break;
            }
        }

        return smallestElement;
    }
}