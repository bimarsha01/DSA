package com.example.NEETCODE;

public class mergeStringAlternatively {
    static void main(String[] args) {

        String word1 = "abc";
        String word2 = "xyz";

        int i = 0;
        String s = null;

        while (i < word1.length() && i < word2.length()) {

            String w1 = String.valueOf(word1.charAt(i));
            String w2 = String.valueOf(word2.charAt(i));
             s = w1.concat(w2);
            i++;
        }
    }
}
