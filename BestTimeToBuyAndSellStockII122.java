package com.zhang.greedy;

public class BestTimeToBuyAndSellStockII122 {
    public static void main(String[] args){

        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {1,2,3,4,5};
        int[] prices3 = {7,6,4,3,1};

        int[] prices;
        int ans;

        prices=prices1;
        ans = maxProfit(prices);
        System.out.println(ans);

        prices=prices2;
        ans = maxProfit(prices);
        System.out.println(ans);

        prices=prices3;
        ans = maxProfit(prices);
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {

        int profit = 0;
        for (int i=1;i<prices.length;i++){
            profit += prices[i] > prices[i - 1] ? (prices[i] - prices[i - 1]) : 0;
        }

        return profit;
    }
}
