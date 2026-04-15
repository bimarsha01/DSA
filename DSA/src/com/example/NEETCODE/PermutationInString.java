package com.example.NEETCODE;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    static void main(String[] args) {
        String s1 = "abc";
        String s2 = "lecaabee";
        boolean finalOp = checkString(s1 , s2);
        System.out.println(finalOp);
    }
    public static boolean checkString(String s1 , String s2){
        Map<Character , Integer> smap = new HashMap<>();
        Map<Character , Integer> wmap = new HashMap<>();
        int i = 0;
       while(i<s1.length()){
           smap.put(s1.charAt(i) , smap.getOrDefault(s1.charAt(i) , 0) + 1);
           i++;
       }
       int left = 0;
       int right = s1.length();

       while(left < s2.length() && right <= s2.length()){
           int j = left;
            while(j<right){
                wmap.put(s2.charAt(j) , wmap.getOrDefault(s2.charAt(j) , 0) + 1);
                j++;
            }
            if(smap.equals(wmap)){
                return true;
            }
            else{
                wmap.clear();
                left++;
                right++;
            }
       }
       return false;
    }
}
