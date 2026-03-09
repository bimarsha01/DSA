package com.example.NEETCODE;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    static void main(String[] args) {
        String s = "tmmzuxt";
        int totalCount = totalCount(s);
        System.out.println(totalCount);
    }
    public static int totalCount(String s){
        Map<Character , Integer> str = new HashMap<>();

        int i = 0;
        int left = 0;
        int maximum = 0;
        int current = 0;
        while(i < s.length()){
            str.put(s.charAt(i) , str.getOrDefault(s.charAt(i) , 0) + 1);
            while(str.get(s.charAt(i)) > 1){
                char leftChar = s.charAt(left);
                str.put(leftChar , str.get(leftChar) - 1);
                left++;
                current = current - 1;
            }
               i++;
            current = current + 1;
            maximum = Math.max(current , maximum);
        }
        return maximum;
    }
}
