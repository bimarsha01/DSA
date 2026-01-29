package com.example.Hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class hashSet {
    public static void main(String[] args) {
       solution2 solution2 = new solution2();

       int[] nums = { 3,4,5,6};
       int target = 7;
int[] ans = solution2.twoSum(nums , target);
        for(int res : ans){
            System.out.println(res);
        }
    }
}
class solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < hashMap.size(); i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff)) {
                return new int[]{i, hashMap.get(diff)};
            }
        }
        return new int[]{-1, -1};
    }
}
