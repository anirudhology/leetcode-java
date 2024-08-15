package com.anirudhology.leetcode.intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            return new int[][]{newInterval};
        }
        // Total intervals
        final int n = intervals.length;
        // List to store the merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        // Process the intervals smaller than the interval to be inserted
        int index = 0;
        while (index < n && intervals[index][1] < newInterval[0]) {
            mergedIntervals.add(intervals[index]);
            index++;
        }
        // Add newInterval and merge, if required
        while (index < n && intervals[index][0] <= newInterval[1]) {
            newInterval = new int[]{
                    Math.min(intervals[index][0], newInterval[0]),
                    Math.max(intervals[index][1], newInterval[1])
            };
            index++;
        }
        // Add this interval to final list
        mergedIntervals.add(newInterval);
        // Add remaining intervals back to the list
        while (index < n) {
            mergedIntervals.add(intervals[index]);
            index++;
        }
        // Convert the list back to array
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}