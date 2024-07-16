package com.anirudhology.leetcode.stack;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DailyTemperaturesTest {

    private final DailyTemperatures dailyTemperatures = new DailyTemperatures();
    
    @Test
    void testDailyTemperatures_nullInput() {
        assertNull(dailyTemperatures.dailyTemperatures(null));
    }
    @Test
    void testDailyTemperatures_emptyInput() {
        assertArrayEquals(new int[]{}, dailyTemperatures.dailyTemperatures(new int[]{}));
    }

    @Test
    void testDailyTemperatures_singleElement() {
        assertArrayEquals(new int[]{0}, dailyTemperatures.dailyTemperatures(new int[]{30}));
    }

    @Test
    void testDailyTemperatures_increasingOrder() {
        assertArrayEquals(new int[]{1, 1, 1, 0}, dailyTemperatures.dailyTemperatures(new int[]{30, 40, 50, 60}));
    }

    @Test
    void testDailyTemperatures_decreasingOrder() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, dailyTemperatures.dailyTemperatures(new int[]{60, 50, 40, 30}));
    }

    @Test
    void testDailyTemperatures_mixedOrder() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void testDailyTemperatures_allSameTemperature() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, dailyTemperatures.dailyTemperatures(new int[]{50, 50, 50, 50}));
    }

    @Test
    void testDailyTemperatures_randomOrder() {
        assertArrayEquals(new int[]{1, 1, 1, 0}, dailyTemperatures.dailyTemperatures(new int[]{30, 31, 32, 33}));
    }
}