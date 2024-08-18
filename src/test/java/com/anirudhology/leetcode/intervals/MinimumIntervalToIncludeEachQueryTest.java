package com.anirudhology.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MinimumIntervalToIncludeEachQueryTest {

    private final MinimumIntervalToIncludeEachQuery minimumIntervalToIncludeEachQuery = new MinimumIntervalToIncludeEachQuery();

    @Test
    void testMinInterval_basicCase() {
        int[][] intervals = {{1, 4}, {2, 4}, {3, 6}};
        int[] queries = {2, 3, 4};
        int[] expected = {3, 3, 3};
        assertArrayEquals(expected, minimumIntervalToIncludeEachQuery.minInterval(intervals, queries));
    }

    @Test
    void testMinInterval_noOverlap() {
        int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
        int[] queries = {7, 8};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, minimumIntervalToIncludeEachQuery.minInterval(intervals, queries));
    }

    @Test
    void testMinInterval_multipleQueries() {
        int[][] intervals = {{2, 5}, {1, 10}};
        int[] queries = {3, 4, 5, 6};
        int[] expected = {4, 4, 4, 10};
        assertArrayEquals(expected, minimumIntervalToIncludeEachQuery.minInterval(intervals, queries));
    }

    @Test
    void testMinInterval_edgeCaseEmptyIntervals() {
        int[][] intervals = {};
        int[] queries = {1, 2, 3};
        int[] expected = {-1, -1, -1};
        assertArrayEquals(expected, minimumIntervalToIncludeEachQuery.minInterval(intervals, queries));
    }

    @Test
    void testMinInterval_edgeCaseEmptyQueries() {
        int[][] intervals = {{1, 5}, {3, 7}};
        int[] queries = {};
        int[] expected = {};
        assertArrayEquals(expected, minimumIntervalToIncludeEachQuery.minInterval(intervals, queries));
    }
}