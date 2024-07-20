package com.anirudhology.leetcode.slidingwindow;

public class BestTimeToBuyAndSellStocks {

    public int maxProfit(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // Maximum profit so far
        int maxProfit = 0;
        // Minimum price so far
        int minPrice = prices[0];
        // Process the stocks
        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }
}
