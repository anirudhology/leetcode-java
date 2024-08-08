package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberTest {

    private final HouseRobber houseRobber = new HouseRobber();

    @Test
    public void testRob() {
        // Test case for single element array
        assertEquals(10, houseRobber.rob(new int[]{10}));

        // Test case for two elements array
        assertEquals(20, houseRobber.rob(new int[]{10, 20}));

        // Test case for more elements
        assertEquals(4, houseRobber.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, houseRobber.rob(new int[]{2, 7, 9, 3, 1}));
        assertEquals(20, houseRobber.rob(new int[]{1, 2, 9, 4, 5, 10}));
    }
}