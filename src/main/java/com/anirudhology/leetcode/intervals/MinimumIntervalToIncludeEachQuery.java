package com.anirudhology.leetcode.intervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumIntervalToIncludeEachQuery {

    public int[] minInterval(int[][] intervals, int[] queries) {
        // Total number of queries
        final int n = queries.length;
        // Array to store final result
        final int[] result = new int[n];
        // Sort the intervals by left value
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        // Create a new array to keep track of indices of queries
        final int[][] queryIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            queryIndex[i] = new int[]{queries[i], i};
        }
        // Sort the array by queries
        Arrays.sort(queryIndex, Comparator.comparingInt(query -> query[0]));
        // Min heap to store the pair of size of interval and right index
        final Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        // Index to keep track of intervals
        int j = 0;
        // Process for every query
        for (int i = 0; i < n; i++) {
            int query = queryIndex[i][0];
            int index = queryIndex[i][1];
            // Add all intervals to the queue for which left value is smaller
            // or equal to the current query value
            while (j < intervals.length && intervals[j][0] <= query) {
                minHeap.offer(new int[]{intervals[j][1] - intervals[j][0] + 1, intervals[j][1]});
                j++;
            }
            // Remove all intervals from the heap for which right value is less than
            // the current query value
            while (!minHeap.isEmpty() && minHeap.peek()[1] < query) {
                minHeap.remove();
            }
            result[index] = minHeap.peek() != null ? minHeap.peek()[0] : -1;
        }
        return result;
    }
}
