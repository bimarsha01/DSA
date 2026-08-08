package com.example.NEETCODE;

public class sqrt {

    public static void main(String[] args) {

        int x = 1073741824;

        int finalAns = sqrt(x);

        System.out.println(finalAns);
    }

    public static int sqrt(int x) {

        int left = 1;
        int right = x;
        int maximumMid = 0;

        while (left <= right) {

            int currentMid = left + (right - left) / 2;

            long sqrtMid = (long) currentMid * currentMid;

            if (sqrtMid > x) {
                right = currentMid - 1;
            }
            else {
                maximumMid = currentMid;
                left = currentMid + 1;
            }
        }

        return maximumMid;
    }
}