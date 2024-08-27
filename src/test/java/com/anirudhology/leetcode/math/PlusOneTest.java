package com.anirudhology.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    private final PlusOne plusOne = new PlusOne();

    @Test
    public void testPlusOneNoCarryOver() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, plusOne.plusOne(input));
    }

    @Test
    public void testPlusOneWithCarryOverInMiddle() {
        int[] input = {1, 2, 9};
        int[] expected = {1, 3, 0};
        assertArrayEquals(expected, plusOne.plusOne(input));
    }

    @Test
    public void testPlusOneWithAllNines() {
        int[] input = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};
        assertArrayEquals(expected, plusOne.plusOne(input));
    }

    @Test
    public void testPlusOneEmptyArray() {
        int[] input = {};
        int[] expected = {1};
        assertArrayEquals(expected, plusOne.plusOne(input));
    }
}