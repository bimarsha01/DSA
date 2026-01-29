package com.example.Hashmap;

public class anagrams {
    public static void main(String[] args) {
        String a = "hello";
        String b = "HELLO";

        solution1 solution = new solution1();
        solution1.isanagram(a , b);
    }



}
class solution1{
    public static void isanagram(String a ,String b){
        a = a.toUpperCase();
        b = b.toUpperCase();

        int[] arr = new int[256];

        for(int i = 0;i<a.length();i++){
            arr[a.charAt(i) - 'A']++;
        }

        for(int i = 0;i<b.length();i++){
            arr[b.charAt(i) - 'A']--;
        }

        for(int i = 0;i<arr.length;i++){
            if(arr[i] >0){
                System.out.println("Not anagram");
            }
        }
    }
}
