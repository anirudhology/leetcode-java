package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BurstBalloonsTest {

    private final BurstBalloons burstBalloons = new BurstBalloons();

    @Test
    void testMaxCoins_singleBalloon() {
        int[] nums = {5};
        assertEquals(5, burstBalloons.maxCoins(nums));
    }

    @Test
    void testMaxCoins_twoBalloons() {
        int[] nums = {3, 1};
        assertEquals(6, burstBalloons.maxCoins(nums));
    }

    @Test
    void testMaxCoins_multipleBalloons() {
        int[] nums = {3, 1, 5, 8};
        assertEquals(167, burstBalloons.maxCoins(nums));
    }

    @Test
    void testMaxCoins_noBalloons() {
        int[] nums = {};
        assertEquals(0, burstBalloons.maxCoins(nums));
    }

    @Test
    void testMaxCoins_largeCase() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        assertEquals(252, burstBalloons.maxCoins(nums));
    }
}