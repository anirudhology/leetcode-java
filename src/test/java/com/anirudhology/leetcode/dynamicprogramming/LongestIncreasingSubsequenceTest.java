package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestIncreasingSubsequenceTest {

    private final LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

    @Test
    public void testLengthOfLIS() {
        // Test case for null input
        assertEquals(0, longestIncreasingSubsequence.lengthOfLIS(null));

        // Test case for empty array
        assertEquals(0, longestIncreasingSubsequence.lengthOfLIS(new int[]{}));

        // Test case for single element array
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(new int[]{10}));

        // Test case for array with all elements the same
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(new int[]{5, 5, 5, 5}));

        // Test case for array with strictly increasing elements
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(new int[]{1, 2, 3, 4}));

        // Test case for array with strictly decreasing elements
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(new int[]{5, 4, 3, 2, 1}));

        // Test case for array with mixed increasing and decreasing elements
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));

        // Test case for array with random elements
        assertEquals(3, longestIncreasingSubsequence.lengthOfLIS(new int[]{3, 10, 2, 1, 20}));
    }
}