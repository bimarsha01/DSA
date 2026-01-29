package com.example.NEETCODE;

public class ValidPalindrome {
    static void main(String[] args) {

    String string = "Was it a car or a cat I saw?";

    int l = 0;
        string = string.toLowerCase().replaceAll("[^a-z0-9]" , "");
    int r = string.length()-1;
        System.out.println(string);
        while(l<r){
            if(string.charAt(l)!=string.charAt(r)){
                System.out.println("not palindrome");
            break;
            }
            l++;
            r--;

        }
        System.out.println("this is palindrome");
    }
}
