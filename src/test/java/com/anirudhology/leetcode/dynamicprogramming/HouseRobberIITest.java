package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberIITest {

    private final HouseRobberII houseRobberII = new HouseRobberII();

    @Test
    public void testRob() {
        // Test case for empty array
        assertEquals(0, houseRobberII.rob(new int[]{}));

        // Test case for single element array
        assertEquals(10, houseRobberII.rob(new int[]{10}));

        // Test case for two elements array
        assertEquals(20, houseRobberII.rob(new int[]{10, 20}));

        // Test case for more elements
        assertEquals(3, houseRobberII.rob(new int[]{2, 3, 2}));
        assertEquals(4, houseRobberII.rob(new int[]{1, 2, 3, 1}));
        assertEquals(103, houseRobberII.rob(new int[]{100, 2, 3, 100}));
    }
}