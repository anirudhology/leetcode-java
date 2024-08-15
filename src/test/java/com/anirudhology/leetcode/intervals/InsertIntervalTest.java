package com.anirudhology.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertIntervalTest {

    private final InsertInterval insertInterval = new InsertInterval();

    @Test
    void testInsertEmptyIntervals() {
        int[][] intervals = {};
        int[] newInterval = {2, 5};
        int[][] expected = {{2, 5}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    void testInsertNonOverlappingBefore() {
        int[][] intervals = {{1, 2}, {3, 5}};
        int[] newInterval = {6, 8};
        int[][] expected = {{1, 2}, {3, 5}, {6, 8}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    void testInsertNonOverlappingAfter() {
        int[][] intervals = {{6, 7}, {8, 10}};
        int[] newInterval = {2, 3};
        int[][] expected = {{2, 3}, {6, 7}, {8, 10}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    void testInsertOverlappingMerge() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 5}, {6, 9}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    void testInsertOverlappingAll() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }
}