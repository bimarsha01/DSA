package com.example.NEETCODE;

import java.util.HashMap;

public class SubArraySumEqualsK {
    static void main(String[] args) {
        int[] arr = { 9,4 , 0,20,3,10,5};
        int k = 33;
        int count = arraySum(arr , k);
        System.out.println(count);
    }
    public static int arraySum(int[] arr , int k){
        HashMap<Integer , Integer> map = new HashMap<>();

        int[] prefix = new int[arr.length];

        int count = 0;
         prefix[0] = arr[0];

        for(int i = 1;i < arr.length;i++){
             map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
             prefix[i] = prefix[i-1] + arr[i];
        }
        for(int j = 0;j<arr.length;j++){
            if(prefix[j] ==k){
                count++;
            }
            int val = prefix[j] - k;
            if(map.containsKey(val)){
                count = count + map.get(val);
            }
        }
        return count;
    }
}
