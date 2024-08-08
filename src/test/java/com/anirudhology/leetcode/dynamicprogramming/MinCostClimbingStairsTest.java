package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostClimbingStairsTest {

    private final MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

    @Test
    public void testMinCostClimbingStairs() {
        // Test case for two elements array
        assertEquals(10, minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15}));
        // Test case for more elements
        assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}