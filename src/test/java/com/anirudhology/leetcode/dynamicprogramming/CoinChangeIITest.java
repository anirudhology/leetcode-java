package com.anirudhology.leetcode.dynamicprogramming;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeIITest {

    private final CoinChangeII coinChangeII = new CoinChangeII();

    @Test
    public void testChange_SimpleCase() {
        assertEquals(4, coinChangeII.change(5, new int[]{1, 2, 5}));
    }

    @Test
    public void testChange_ZeroAmount() {
        assertEquals(1, coinChangeII.change(0, new int[]{1, 2, 5}));
    }

    @Test
    public void testChange_NoCoins() {
        assertEquals(0, coinChangeII.change(5, new int[]{}));
    }

    @Test
    public void testChange_NegativeAmount() {
        assertEquals(0, coinChangeII.change(-1, new int[]{1, 2, 5}));
    }

    @Test
    public void testChange_NoSolution() {
        assertEquals(0, coinChangeII.change(3, new int[]{2}));
    }
}
    