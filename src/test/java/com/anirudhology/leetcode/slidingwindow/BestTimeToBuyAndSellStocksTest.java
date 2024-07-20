package com.anirudhology.leetcode.slidingwindow;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStocksTest {

    private final BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();

    @Test
    public void testEmptyPrices() {
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(new int[] {}));
    }

    @Test
    public void testNullPrices() {
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(null));
    }

    @Test
    public void testSinglePrice() {
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(new int[] {10}));
    }

    @Test
    public void testAllIncreasingPrices() {
        assertEquals(4, bestTimeToBuyAndSellStocks.maxProfit(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void testAllDecreasingPrices() {
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(new int[] {5, 4, 3, 2, 1}));
    }

    @Test
    public void testMixedPrices() {
        assertEquals(5, bestTimeToBuyAndSellStocks.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void testNoProfitPrices() {
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(new int[] {7, 6, 4, 3, 1}));
    }

    @Test
    public void testMultiplePeaksPrices() {
        assertEquals(4, bestTimeToBuyAndSellStocks.maxProfit(new int[] {3, 3, 5, 0, 0, 3, 1, 4}));
    }
}