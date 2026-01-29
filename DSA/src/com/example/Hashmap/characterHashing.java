package com.example.Hashmap;

import java.util.Scanner;

public class characterHashing {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr =new int[256];

            for(int i = 0;i<5;i++){
                System.out.println("Enter for " + i);
                char ch = sc.next().charAt(0);
                arr[ch]++;
            }

            for(int i = 0;i<5;i++){
                System.out.println("Enter the characters to check ");
                char ch = sc.next().charAt(0);
                System.out.println("this character repeats " + arr[ch] + " times");
            }

        }
    }

