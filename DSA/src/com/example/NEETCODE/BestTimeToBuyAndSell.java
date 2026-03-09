package com.example.NEETCODE;

public class BestTimeToBuyAndSell {
    static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = 0;
        for(int i = 0;i<prices.length-1;i++){
            if(prices[i] > prices[i+1]){
                continue;
            }
            else if(prices[i]< prices[i+1]){
                int res = prices[i+1] - prices[i];
                profit = profit + res;
            }
        }
        System.out.println(profit);
    }
}
