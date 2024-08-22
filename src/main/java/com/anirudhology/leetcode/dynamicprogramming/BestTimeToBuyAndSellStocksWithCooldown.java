package com.anirudhology.leetcode.dynamicprogramming;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocksWithCooldown {

    public int maxProfit(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // Total number of stocks
        final int n = prices.length;
        // Lookup table to store the buying prices and selling prices
        final int[] buy = new int[n];
        final int[] sell = new int[n];
        // Fill the arrays with default values
        Arrays.fill(buy, Integer.MIN_VALUE);
        Arrays.fill(sell, 0);
        // For the first day
        buy[0] = -prices[0];
        sell[0] = 0;
        // Process all the stocks
        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i - 1], i > 1 ? sell[i - 2] - prices[i] : -prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
        }
        return sell[n - 1];
    }
}
