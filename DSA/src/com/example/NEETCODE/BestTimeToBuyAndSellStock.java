package com.example.NEETCODE;

public class BestTimeToBuyAndSellStock {
    static void main(String[] args) {
        int[] arr = {7,1,5,3,6,5,4};
        int finalOp = stocks(arr);
        System.out.println(finalOp);
    }
    public static int stocks(int[] prices){

        int l = 0, r = 1;
        int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
