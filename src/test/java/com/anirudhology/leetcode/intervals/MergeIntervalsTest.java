package com.anirudhology.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeIntervalsTest {

    private final MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    void testMergeIntervals() {
        // Test case: Overlapping intervals
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result1 = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(result1, mergeIntervals.merge(intervals1));

        // Test case: Non-overlapping intervals
        int[][] intervals2 = {{1, 4}, {5, 6}};
        int[][] result2 = {{1, 4}, {5, 6}};
        assertArrayEquals(result2, mergeIntervals.merge(intervals2));

        // Test case: Single interval
        int[][] intervals3 = {{1, 4}};
        int[][] result3 = {{1, 4}};
        assertArrayEquals(result3, mergeIntervals.merge(intervals3));

        // Test case: Empty array
        int[][] intervals4 = {};
        int[][] result4 = {};
        assertArrayEquals(result4, mergeIntervals.merge(intervals4));

        // Test case: Null input
        assertArrayEquals(null, mergeIntervals.merge(null));

        // Test case: Continuous intervals
        int[][] intervals6 = {{1, 4}, {4, 5}};
        int[][] result6 = {{1, 5}};
        assertArrayEquals(result6, mergeIntervals.merge(intervals6));
    }
}