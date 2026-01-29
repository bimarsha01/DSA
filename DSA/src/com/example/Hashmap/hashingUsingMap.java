package com.example.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashingUsingMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Enter how many numbers you want to check:");
        int m = sc.nextInt();
        System.out.println("Enter the numbers to check their frequency:");
        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();
            System.out.println("The integer " + key + " appears " + map.getOrDefault(key, 0) + " times.");
        }

        sc.close();
    }
}
