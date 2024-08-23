package com.anirudhology.leetcode.dynamicprogramming;

public class CoinChangeII {

    public int change(int amount, int[] coins) {
        // Special case
        if (coins == null || coins.length == 0 || amount < 0) {
            return 0;
        }
        // Lookup table to store the number of ways to
        // make up amount
        final int[] lookup = new int[amount + 1];
        // There is one way to make up amount = 0;
        // don't take anything
        lookup[0] = 1;
        // Populate the remaining table
        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (coin <= i) {
                    lookup[i] += lookup[i - coin];
                }
            }
        }
        return lookup[amount];
    }
}
