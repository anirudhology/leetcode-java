package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStocksWithCooldownTest {

    private final BestTimeToBuyAndSellStocksWithCooldown bestTimeToBuyAndSellStocksWithCooldown =
            new BestTimeToBuyAndSellStocksWithCooldown();

    @Test
    public void testMaxProfit_SimpleCase() {
        assertEquals(3, bestTimeToBuyAndSellStocksWithCooldown.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    @Test
    public void testMaxProfit_EmptyPrices() {
        assertEquals(0, bestTimeToBuyAndSellStocksWithCooldown.maxProfit(new int[]{}));
    }

    @Test
    public void testMaxProfit_OneDay() {
        assertEquals(0, bestTimeToBuyAndSellStocksWithCooldown.maxProfit(new int[]{1}));
    }

    @Test
    public void testMaxProfit_TwoDays_Profit() {
        assertEquals(1, bestTimeToBuyAndSellStocksWithCooldown.maxProfit(new int[]{1, 2}));
    }

    @Test
    public void testMaxProfit_TwoDays_Loss() {
        assertEquals(0, bestTimeToBuyAndSellStocksWithCooldown.maxProfit(new int[]{2, 1}));
    }

    @Test
    public void testMaxProfit_AllDecreasingPrices() {
        assertEquals(0, bestTimeToBuyAndSellStocksWithCooldown.maxProfit(new int[]{5, 4, 3, 2, 1}));
    }
}