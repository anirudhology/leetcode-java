package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    public void testClimbStairs() {
        // Test case for n = 0
        assertEquals(0, climbingStairs.climbStairs(0));

        // Test case for n = 1
        assertEquals(1, climbingStairs.climbStairs(1));

        // Test case for n = 2
        assertEquals(2, climbingStairs.climbStairs(2));

        // Test case for n = 3
        assertEquals(3, climbingStairs.climbStairs(3));

        // Test case for n = 4
        assertEquals(5, climbingStairs.climbStairs(4));

        // Test case for n = 5
        assertEquals(8, climbingStairs.climbStairs(5));
    }
}