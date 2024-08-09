package com.anirudhology.leetcode.dynamicprogramming;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        // Special case
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }
        // Lookup table to store the minimum number of coins
        // to make the amount i
        final int[] lookup = new int[amount + 1];
        // Fill the array with default values
        Arrays.fill(lookup, Integer.MAX_VALUE);
        lookup[0] = 0;
        // Fill up lookup table
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    int difference = lookup[i - coin];
                    if (difference != Integer.MAX_VALUE) {
                        lookup[i] = Math.min(lookup[i], lookup[i - coin] + 1);
                    }
                }
            }
        }
        return lookup[amount] == Integer.MAX_VALUE ? -1 : lookup[amount];
    }
}
