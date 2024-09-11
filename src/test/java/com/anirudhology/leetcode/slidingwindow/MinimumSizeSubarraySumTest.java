package com.anirudhology.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumTest {

    private final MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();

    @Test
    void testMinSubArrayLen_EmptyArray() {
        assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(7, new int[]{}));
    }

    @Test
    void testMinSubArrayLen_NullArray() {
        assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(7, null));
    }

    @Test
    void testMinSubArrayLen_NoSubarrayExists() {
        assertEquals(5, minimumSizeSubarraySum.minSubArrayLen(15, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testMinSubArrayLen_ExactMatch() {
        assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void testMinSubArrayLen_MultipleMatches() {
        assertEquals(1, minimumSizeSubarraySum.minSubArrayLen(4, new int[]{1, 4, 4}));
    }

    @Test
    void testMinSubArrayLen_SingleElement() {
        assertEquals(1, minimumSizeSubarraySum.minSubArrayLen(3, new int[]{3}));
    }
}