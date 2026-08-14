package com.example.NEETCODE;

public class FindElementInRotatedArray {
    public static void main(String[] args) {

        int[] nums = {1,0,1,1,1};
        int target = 0;
        FindElementInRotatedArray obj = new FindElementInRotatedArray();

        boolean result = obj.search(nums , target);

        System.out.println("Minimum element: " + result);
    }

    public boolean search(int[] nums , int target) {

        int left = 0;
        int right = nums.length-1;

       while(left <=right){
           int mid = left + (right-left)/2;

           if(nums[left] <= nums[mid]){
               if(nums[left] == nums[mid]){
                   left++;
               }
               else if (target>=nums[left] && target<=nums[mid]){
                   right = mid;
               }
               else{
                   left = mid +1;
               }
           } else if (nums[right] >= nums[mid]) {
               if(nums[right] == nums[mid]){
                   right--;
               }

               else if(target>=nums[left] && target<=nums[right]){
                   left = mid;
               }
               else{
                   right = mid -1;
               }
           }

           if(nums[mid] == target){
               return true;
           }
       }
        return false;
    }
}
