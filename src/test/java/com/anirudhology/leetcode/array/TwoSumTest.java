package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    public void testFoundAtStart() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testFoundAtEnd() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testNoResult() {
        int[] nums = {1, 2, 3, 4};
        int target = 8;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums, target));
        assertEquals("Invalid inputs!", exception.getMessage());
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums, target));
        assertEquals("Array must have at least two elements.", exception.getMessage());
    }

    @Test
    public void testNullArray() {
        int target = 5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(null, target));
        assertEquals("Array must have at least two elements.", exception.getMessage());
    }

    @Test
    public void testDuplicates() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testZeroes() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] expected = {0, 3};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000000, 999999999, 1, 2};
        int target = 1999999999;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}