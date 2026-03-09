package com.example.NEETCODE;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    static void main(String[] args) {

        int[] arr = {2 , 0 , 0 , 2 , 2};
        int k = 3;
        boolean finalOp = containsDupli(arr , k );
        System.out.println(finalOp);
    }
    public static boolean containsDupli(int[] nums , int k){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
        }

    }
