package com.example.NEETCODE;

import java.util.HashMap;

public class SubarraySumEqualK {

    static void main(String[] args) {

    int[] nums = {2 , -1 , 1 , 2};
    int k = 2;

    int currentSum = 0;
    int count = 0;
    HashMap<Integer , Integer> hashMap = new HashMap<>();
    hashMap.put(0,1);

    for(int i : nums){
        currentSum = currentSum + i;
        if (hashMap.containsKey(currentSum - k)) {
            count += hashMap.get(currentSum - k);
        }
        hashMap.put(currentSum , hashMap.getOrDefault(currentSum , 0)+1);

    }
        System.out.println(count);

    }

}
