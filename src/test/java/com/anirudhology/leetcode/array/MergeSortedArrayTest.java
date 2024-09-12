package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void testMerge_BothNonEmpty() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, mergeSortedArray.merge(nums1, m, nums2, n));
    }

    @Test
    public void testMerge_EmptyNums2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int m = 3, n = 0;
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, mergeSortedArray.merge(nums1, m, nums2, n));
    }

    @Test
    public void testMerge_EmptyNums1() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 0, n = 3;
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, mergeSortedArray.merge(nums1, m, nums2, n));
    }

    @Test
    public void testMerge_EmptyBoth() {
        int[] nums1 = {};
        int[] nums2 = {};
        int m = 0, n = 0;
        int[] expected = {};
        assertArrayEquals(expected, mergeSortedArray.merge(nums1, m, nums2, n));
    }

    @Test
    public void testMerge_SingleElementNums1() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1, n = 0;
        int[] expected = {1};
        assertArrayEquals(expected, mergeSortedArray.merge(nums1, m, nums2, n));
    }

    @Test
    public void testMerge_SingleElementNums2() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        int[] expected = {1};
        assertArrayEquals(expected, mergeSortedArray.merge(nums1, m, nums2, n));
    }
}