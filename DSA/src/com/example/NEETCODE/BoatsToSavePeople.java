package com.example.NEETCODE;

import java.util.Arrays;

public class BoatsToSavePeople {
    static void main(String[] args) {
        int[] arr = {1,3,2,3,2};

        int limit = 3;
        int op = numRescueBoats(arr, limit);
        System.out.println(op);
    }

    public static int numRescueBoats(int[] people, int limit) {

        int count = 0;

        Arrays.sort(people);

        int left = 0;
        int right = people.length-1;

        while (left <= right) {
            if (left < right && people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }

            count++;
        }
        return count;
    }
}
