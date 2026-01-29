package com.example.Hashmap;


import java.util.HashMap;

public class pr_1 {
    public static void main(String[] args) {
        int[] nums = { 10 , 20 , 30 , 40 , 50};
        solution solution = new solution();

        boolean ans = solution.hasDuplicate(nums);
        System.out.println(ans);
    }
}

class solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for(int num : nums){
            if(hashMap.containsKey(num))
                return true;
            else{
                hashMap.put(num , true);
            }
        }
        return false;

    }
}
