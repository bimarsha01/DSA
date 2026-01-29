package com.example.NEETCODE;

public class ReverseString {
    static void main(String[] args) {

    Character[] chars = {'n' , 'e' , 'e' , 't'};
    int l =0;
    int r = chars.length-1;
       while(l<r){
           char temp = chars[l];
           chars[l] = chars[r];
           chars[r] = temp;
           l++;
           r--;
       }
       for(int i = 0;i< chars.length;i++){
           System.out.println(chars[i]);
       }
    }
}
