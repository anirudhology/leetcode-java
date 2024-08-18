package com.anirudhology.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonOverlappingIntervalsTest {

    private final NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();

    @Test
    void testEraseOverlapIntervals() {
        // Test case: Overlapping intervals
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(1, nonOverlappingIntervals.eraseOverlapIntervals(intervals1));

        // Test case: Non-overlapping intervals
        int[][] intervals2 = {{1, 2}, {2, 3}, {3, 4}};
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(intervals2));

        // Test case: Single interval
        int[][] intervals3 = {{1, 2}};
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(intervals3));

        // Test case: Empty array
        int[][] intervals4 = {};
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(intervals4));

        // Test case: Null input
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(null));

        // Test case: Multiple overlapping intervals
        int[][] intervals6 = {{1, 3}, {2, 4}, {3, 5}, {1, 2}};
        assertEquals(2, nonOverlappingIntervals.eraseOverlapIntervals(intervals6));
    }

}