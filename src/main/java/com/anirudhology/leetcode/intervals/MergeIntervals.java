package com.anirudhology.leetcode.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            return intervals;
        }
        // Sort the intervals by their start time
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        // List to store merged intervals
        final List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        // Add the current interval to the list
        mergedIntervals.add(currentInterval);
        // Process all intervals
        for (int[] nextInterval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];
            // When intervals are overlapping
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = nextInterval;
                mergedIntervals.add(nextInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }
}
