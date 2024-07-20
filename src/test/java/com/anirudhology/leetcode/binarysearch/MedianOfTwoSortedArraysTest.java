package com.anirudhology.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    public void testBothArraysHaveMultipleElementsEvenLength() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testBothArraysHaveMultipleElementsOddLength() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testFirstArrayIsEmpty() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(3.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testSecondArrayIsEmpty() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {};
        assertEquals(3.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testArraysWithOneElementEach() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        assertEquals(1.5, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testArraysWithDifferentLengths() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 5};
        assertEquals(3.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testIdenticalElements() {
        int[] nums1 = {1, 1, 1};
        int[] nums2 = {1, 1, 1};
        assertEquals(1.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testDifferentPartitions() {
        int[] nums1 = {1, 3, 8};
        int[] nums2 = {7, 9, 10, 11};
        assertEquals(8.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    public void testLargeArrays() {
        int[] nums1 = new int[1000];
        int[] nums2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums1[i] = i;
            nums2[i] = i + 1000;
        }
        assertEquals(999.5, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}