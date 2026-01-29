package com.example.NEETCODE;



public class findMissingPositive {
    static void main(String[] args) {

    int[] nums = {1,2,4,5,6,3,1};
    int i = 0;
    while( i < nums.length){
        if(nums[i] > nums.length || nums[i] <= 0){
            i++;
        }
        else if(nums[i] == i+1){
            i++;
        }
        else if(nums[i] != i+1){
            if(nums[i] ==nums[nums[i]-1]){
                i++;
            }
            else {
                swap(i, nums[i] - 1, nums);
            }
        }
    }
    for(int j = 0;j< nums.length;j++){
        if(nums[j] != j+1){
            System.out.println(j+1);
            return;
        }
    }
        System.out.println(nums.length+1);
    }

    public static void swap(int a , int b , int[] nums){

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }



}
