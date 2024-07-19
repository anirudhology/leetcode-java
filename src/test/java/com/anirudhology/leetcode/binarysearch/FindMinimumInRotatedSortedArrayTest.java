package com.anirudhology.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumInRotatedSortedArrayTest {

    private final FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

    @Test
    public void testFindMinSingleElement() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{1}));
    }

    @Test
    public void testFindMinNoRotation() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testFindMinFullRotation() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testFindMinHalfRotation() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void testFindMinMultipleRotations() {
        assertEquals(0, findMinimumInRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    public void testFindMinDecreasingOrder() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{3, 2, 1}));
    }

    @Test
    public void testFindMinAscendingOrder() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testFindMinMinAtEnd() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{2, 3, 4, 5, 1}));
    }

    @Test
    public void testFindMinMinAtStart() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{1, 2, 3, 4, 5}));
    }
}