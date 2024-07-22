package com.anirudhology.leetcode.slidingwindow;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SlidingWindowMaximumTest {

    private final SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();

    @Test
    public void testMaxSlidingWindow() {
        assertArrayEquals(new int[]{3, 3, 2, 5}, slidingWindowMaximum.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3));
        assertArrayEquals(new int[]{7, 6, 6, 8, 8}, slidingWindowMaximum.maxSlidingWindow(new int[]{7, 2, 4, 6, 5, 8, 2}, 3));
        assertArrayEquals(new int[]{1}, slidingWindowMaximum.maxSlidingWindow(new int[]{1}, 1));
        assertArrayEquals(new int[]{1, -1}, slidingWindowMaximum.maxSlidingWindow(new int[]{1, -1}, 1));
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, slidingWindowMaximum.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        assertArrayEquals(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5}, slidingWindowMaximum.maxSlidingWindow(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, 2));
        assertArrayEquals(new int[]{}, slidingWindowMaximum.maxSlidingWindow(new int[]{}, 0));
        assertArrayEquals(new int[]{}, slidingWindowMaximum.maxSlidingWindow(new int[]{}, -1));
        assertArrayEquals(new int[]{1, 2, 3}, slidingWindowMaximum.maxSlidingWindow(new int[]{1, 2, 3}, 0));
        assertArrayEquals(new int[]{3}, slidingWindowMaximum.maxSlidingWindow(new int[]{1, 2, 3}, 3));
        assertNull(slidingWindowMaximum.maxSlidingWindow(null, 3));
    }

    @Test
    public void testEdgeCases() {
        // Edge case where k > length of array
        assertArrayEquals(new int[]{}, slidingWindowMaximum.maxSlidingWindow(new int[]{1, 2, 3}, 4));
        // Edge case where all elements are the same
        assertArrayEquals(new int[]{2, 2, 2, 2}, slidingWindowMaximum.maxSlidingWindow(new int[]{2, 2, 2, 2}, 1));
        // Edge case where array is in descending order
        assertArrayEquals(new int[]{9, 8, 7, 6, 5}, slidingWindowMaximum.maxSlidingWindow(new int[]{9, 8, 7, 6, 5}, 2));
        // Edge case where array is in ascending order
        assertArrayEquals(new int[]{2, 3, 4, 5}, slidingWindowMaximum.maxSlidingWindow(new int[]{1, 2, 3, 4, 5}, 2));
    }
}