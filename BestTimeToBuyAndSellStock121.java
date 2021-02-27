package com.zhang.greedy;

public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args){

        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        int[] prices;
        int ans;

        prices=prices1;
        ans = maxProfit(prices);
        System.out.println(ans);

        prices=prices2;
        ans = maxProfit(prices);
        System.out.println(ans);

    }

    public static int maxProfit(int[] prices) {

        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int price : prices){
            if (price < min_value){
                min_value = price;
            }else{
                if (price - min_value>max_profit) {
                    //max_profit = Math.max(max_profit, price - min_value);
                    max_profit = price - min_value;
                }
            }
        }

        return max_profit;
    }
}
