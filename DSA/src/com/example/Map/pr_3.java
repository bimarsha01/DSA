package com.example.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pr_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> mpp = new HashMap<>();

        // --- FIRST INPUT PHASE ---
        System.out.println("Enter how many numbers in first list:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            // count occurrences of each number
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        // --- SECOND INPUT PHASE ---
        System.out.println("Enter how many numbers you want to check:");
        int m = sc.nextInt();

        System.out.println("Enter " + m + " numbers to check:");
        for (int i = 0; i < m; i++) {
            int check = sc.nextInt();
            // print how many times 'check' appeared in first list
            System.out.print(mpp.getOrDefault(check, 0) + " ");
        }

        sc.close();
    }
}
