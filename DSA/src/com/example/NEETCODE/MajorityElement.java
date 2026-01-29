package com.example.NEETCODE;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static void main(String[] args) {
        int[] nums = {5,1,1,5,5,1,3,1};
        int count;
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        for(int i : nums){
               hashMap.put( i  , hashMap.getOrDefault(i,0) + 1);
        }

int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey);
    }
}
