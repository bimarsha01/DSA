package com.example.NEETCODE;

import java.util.HashMap;

public class ContainsDupli {
    static void main(String[] args) {
        int[] arr = {1,2,3,1};
        boolean containsDupli = containsDuplicate(arr);
        System.out.println(containsDupli);
    }
    public static boolean containsDuplicate(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();

        int i = 0;
        while(i < arr.length){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
            if(map.get(arr[i]) > 1){
        System.out.println(map);
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
