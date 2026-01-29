package com.example.NEETCODE;

import java.util.Arrays;
import java.util.HashMap;

public class SortColor {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 0};
        sortColor(arr);
    }

    public static void sortColor(int[] nums) {
        int mid = 0;
        int low = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid]==0){
                int temp;
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low = low + 1;
                mid = mid + 1;
            }
            else if(nums[mid] == 1){
                mid = mid + 1;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high = high-1;
            }
        }
        for(int i :nums){
            System.out.println(i);
        }
    }
}
