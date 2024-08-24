package com.anirudhology.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    public void testMissingNumberWithSingleElementZero() {
        int[] nums = {0};
        assertEquals(1, missingNumber.missingNumber(nums), "The missing number in [0] should be 1.");
    }

    @Test
    public void testMissingNumberWithSingleElementOne() {
        int[] nums = {1};
        assertEquals(0, missingNumber.missingNumber(nums), "The missing number in [1] should be 0.");
    }

    @Test
    public void testMissingNumberWithNoMissing() {
        int[] nums = {0, 1, 2, 3, 4};
        assertEquals(5, missingNumber.missingNumber(nums), "The missing number in [0, 1, 2, 3, 4] should be 5.");
    }

    @Test
    public void testMissingNumberWithMissingInMiddle() {
        int[] nums = {3, 0, 1};
        assertEquals(2, missingNumber.missingNumber(nums), "The missing number in [3, 0, 1] should be 2.");
    }

    @Test
    public void testMissingNumberWithMissingAtEnd() {
        int[] nums = {0, 1, 3};
        assertEquals(2, missingNumber.missingNumber(nums), "The missing number in [0, 1, 3] should be 2.");
    }

    @Test
    public void testMissingNumberWithLargeArray() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, missingNumber.missingNumber(nums), "The missing number in [9, 6, 4, 2, 3, 5, 7, 0, 1] should be 8.");
    }

    @Test
    public void testMissingNumberEmptyArray() {
        int[] nums = {};
        assertEquals(0, missingNumber.missingNumber(nums), "The missing number in an empty array should be 0.");
    }
}