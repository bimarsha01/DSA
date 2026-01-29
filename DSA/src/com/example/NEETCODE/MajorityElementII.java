package com.example.NEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementII {
    static void main(String[] args) {
        int[] nums = {5, 2, 3, 2, 2, 2, 2, 5, 5, 5};
        int checkpoint = (int) Math.floor((double) nums.length /3);
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : nums){
            hashMap.put(i , hashMap.getOrDefault(i , 0) +1);
        }
ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : hashMap.entrySet()){
            if(entry.getValue() > checkpoint){
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for(int j : list){
            res[i++] = j;
        }
        for(int k : res){
            System.out.println(k);
        }
    }
}
