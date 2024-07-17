package com.anirudhology.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LargestRectangleInHistogramTest {

    private final LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();

    @Test
    public void testLargestRectangleArea() {
        // Test case 1: Basic functionality
        assertEquals(10, largestRectangleInHistogram.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));

        // Test case 2: Empty array
        assertEquals(0, largestRectangleInHistogram.largestRectangleArea(new int[]{}));

        // Test case 3: Single element
        assertEquals(5, largestRectangleInHistogram.largestRectangleArea(new int[]{5}));

        // Test case 4: All elements same height
        assertEquals(9, largestRectangleInHistogram.largestRectangleArea(new int[]{3, 3, 3}));

        // Test case 5: Increasing heights
        assertEquals(9, largestRectangleInHistogram.largestRectangleArea(new int[]{1, 2, 3, 4, 5}));

        // Test case 6: Decreasing heights
        assertEquals(9, largestRectangleInHistogram.largestRectangleArea(new int[]{5, 4, 3, 2, 1}));

        // Test case 7: Mixed heights
        assertEquals(12, largestRectangleInHistogram.largestRectangleArea(new int[]{6, 2, 5, 4, 5, 1, 6}));

        // Test case 8: Null input
        assertEquals(0, largestRectangleInHistogram.largestRectangleArea(null));

        // Test case 9: Heights with zero
        assertEquals(6, largestRectangleInHistogram.largestRectangleArea(new int[]{0, 6, 0, 3, 4, 0, 5}));
    }
}