package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductSubarrayTest {

    private final MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();

    @Test
    public void testMaxProduct() {
        // Test case for null input
        assertEquals(0, maximumProductSubarray.maxProduct(null));

        // Test case for empty array
        assertEquals(0, maximumProductSubarray.maxProduct(new int[]{}));

        // Test case for single positive element
        assertEquals(2, maximumProductSubarray.maxProduct(new int[]{2}));

        // Test case for single negative element
        assertEquals(-2, maximumProductSubarray.maxProduct(new int[]{-2}));

        // Test case for array with both positive and negative elements
        assertEquals(6, maximumProductSubarray.maxProduct(new int[]{2, 3, -2, 4}));

        // Test case for array with a zero
        assertEquals(24, maximumProductSubarray.maxProduct(new int[]{-2, 0, -1, 6, -4}));

        // Test case for all negative elements
        assertEquals(12, maximumProductSubarray.maxProduct(new int[]{-1, -3, -4}));

        // Test case for all positive elements
        assertEquals(720, maximumProductSubarray.maxProduct(new int[]{1, 2, 3, 4, 5, 6}));

        // Test case for array with a mix of positive, negative, and zero elements
        assertEquals(180, maximumProductSubarray.maxProduct(new int[]{-2, 0, -1, -3, 10, 6}));
    }
}