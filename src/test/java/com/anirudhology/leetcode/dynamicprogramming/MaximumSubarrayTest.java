package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayTest {

    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    void testMaxSubArraySingleElement() {
        assertEquals(5, maximumSubarray.maxSubArray(new int[]{5}));
    }

    @Test
    void testMaxSubArrayAllNegative() {
        assertEquals(-1, maximumSubarray.maxSubArray(new int[]{-1, -2, -3, -4}));
    }

    @Test
    void testMaxSubArrayMixed() {
        assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void testMaxSubArrayAllPositive() {
        assertEquals(15, maximumSubarray.maxSubArray(new int[]{1, 2, 3, 4, 5}));
    }
}