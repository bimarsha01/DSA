package com.example.NEETCODE;

import java.util.Arrays;

public class KokoEatingBananas {

    public static void main(String[] args) {

        int[] piles = {1, 4, 3, 2};
        int h = 9;

        KokoEatingBananas obj = new KokoEatingBananas();

        int result = obj.minEatingSpeed(piles, h);

        System.out.println("Minimum eating speed: " + result);
    }

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();

        int res = r;

        while (l <= r) {

            int k = l + (r - l) / 2;

            long totalTime = 0;

            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }

            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }

        return res;
    }
}