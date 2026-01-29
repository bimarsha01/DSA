package com.example.NEETCODE;

public class ValidPalindromeII {

    static void main(String[] args) {
        String string = "eceec";
        string = string.toLowerCase().replaceAll("[^a-z0-9]" , "");

        int left = 0;
        int right = string.length()-1;

        while(left<right) {

            if (string.charAt(left) == string.charAt(right)) {
                left++;
                right--;
            }
            else{
                boolean skipLeft = ispalindrome(string , left+1 , right);
                boolean skipRight = ispalindrome(string , left , right-1);

                if(skipLeft || skipRight){
                    System.out.println("this is palindrome");
                    return;
                }
                else{
                    System.out.println("this is not a palindrome");
                    return;
                }
            }

            System.out.println("this is palindrome");
        }
    }

    static boolean ispalindrome(String s , int l , int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
