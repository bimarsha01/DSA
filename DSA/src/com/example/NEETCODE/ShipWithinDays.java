package com.example.NEETCODE;

public class ShipWithinDays {

    public static int shipWithinDays(int[] weights, int days) {

        int l = 0;
        int r = 0;

        // Find:
        // l = minimum possible capacity
        // r = maximum possible capacity
        for (int w : weights) {

            // The ship must be able to carry
            // the heaviest package.
            l = Math.max(l, w);

            // Maximum capacity is the total weight.
            r += w;
        }

        int res = r;

        // Binary search for the minimum valid capacity
        while (l <= r) {

            int cap = l + (r - l) / 2;

            if (canShip(weights, days, cap)) {

                // This capacity works.
                // Save it as a possible answer.
                res = Math.min(res, cap);

                // Try a smaller capacity.
                r = cap - 1;

            } else {

                // This capacity is too small.
                // Increase capacity.
                l = cap + 1;
            }
        }

        return res;
    }

    private static boolean canShip(int[] weights, int days, int cap) {

        // Start with the first day.
        int ships = 1;

        // Remaining capacity of today's ship.
        int currCap = cap;

        for (int w : weights) {

            // Does this package fit?
            if (currCap - w < 0) {

                // It doesn't fit.
                // We need another day/ship.
                ships++;

                // If we already need more days than allowed,
                // this capacity doesn't work.
                if (ships > days) {
                    return false;
                }

                // Start a new day with a fresh ship.
                currCap = cap;
            }

            // Put the package on the current ship.
            currCap -= w;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] weights = {
                1, 2, 3, 4, 5,
                6, 7, 8, 9, 10
        };

        int days = 5;

        int result = shipWithinDays(weights, days);

        System.out.println("Minimum ship capacity: " + result);
    }
}