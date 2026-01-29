package com.example.NEETCODE;

public class commonLongestPrefix {

    public static void main(String[] args) {

        String[] strs = {"apple", "anana", "aat"};

       for(int i = 0;i<strs[0].length();i++){
           for(String s : strs){
               if(i==s.length() || s.charAt(i) != strs[0].charAt(i)){
                   System.out.println(s.substring(0,i));
                   return;
               }
           }
       }
        System.out.println(strs[0]);
    }
}
