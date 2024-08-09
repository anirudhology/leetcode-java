package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangeTest {

    private final CoinChange coinChange = new CoinChange();

    @Test
    public void testCoinChange() {
        // Test case for null coins array
        assertEquals(-1, coinChange.coinChange(null, 5));

        // Test case for empty coins array
        assertEquals(-1, coinChange.coinChange(new int[]{}, 5));

        // Test case for negative amount
        assertEquals(-1, coinChange.coinChange(new int[]{1, 2, 5}, -5));

        // Test case for amount 0
        assertEquals(0, coinChange.coinChange(new int[]{1, 2, 5}, 0));

        // Test case for amount that can't be reached
        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));

        // Test case for amount with exact coin matches
        assertEquals(1, coinChange.coinChange(new int[]{1, 2, 5}, 5));

        // Test case for amount with no exact match but can be reached
        assertEquals(3, coinChange.coinChange(new int[]{1, 2, 5}, 11)); // 5+5+1

        // Test case for large amount
        assertEquals(20, coinChange.coinChange(new int[]{1, 2, 5}, 100)); // 20 coins of 5
    }
}