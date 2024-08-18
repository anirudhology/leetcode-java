package com.anirudhology.leetcode.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        // Sort the intervals by their end times
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[1]));
        // Non-overlapped interval
        int nonOverlappingIntervals = 1;
        // Current interval's end time
        int currentEnd = intervals[0][1];
        // Process all remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            // If the intervals are non-overlapping
            if (intervals[i][0] >= currentEnd) {
                currentEnd = intervals[i][1];
                nonOverlappingIntervals++;
            }
        }
        return intervals.length - nonOverlappingIntervals;
    }
}
