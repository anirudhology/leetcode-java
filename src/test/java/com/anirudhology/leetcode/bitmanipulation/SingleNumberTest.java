package com.anirudhology.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    public void testSingleNumberWithSingleElement() {
        int[] nums = {5};
        assertEquals(5, singleNumber.singleNumber(nums));
    }

    @Test
    public void testSingleNumberWithMultipleElements() {
        int[] nums = {2, 2, 1};
        assertEquals(1, singleNumber.singleNumber(nums));
    }

    @Test
    public void testSingleNumberWithAllNegativeElements() {
        int[] nums = {-3, -1, -1};
        assertEquals(-3, singleNumber.singleNumber(nums));
    }

    @Test
    public void testSingleNumberWithMixedElements() {
        int[] nums = {4, 1, 2, 1, 2};
        assertEquals(4, singleNumber.singleNumber(nums));
    }

    @Test
    public void testSingleNumberWithZeros() {
        int[] nums = {0, 1, 1};
        assertEquals(0, singleNumber.singleNumber(nums));
    }
}