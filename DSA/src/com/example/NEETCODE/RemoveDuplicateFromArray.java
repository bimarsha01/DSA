package com.example.NEETCODE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    static void main(String[] args) {

    int[] nums = { 1 ,2 , 3 ,3 };

    Set<Integer> set = new HashSet<>();

    for(Integer integer : nums){
        set.add(integer);
    }

    if(set.size() < nums.length){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    }

}
