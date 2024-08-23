package com.anirudhology.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingBitsTest {

    private final CountingBits countingBits = new CountingBits();

    @Test
    public void testCountBitsWithZero() {
        int[] expected = {0};
        assertArrayEquals(expected, countingBits.countBits(0), "Count bits of 0 should return [0].");
    }

    @Test
    public void testCountBitsWithOne() {
        int[] expected = {0, 1};
        assertArrayEquals(expected, countingBits.countBits(1), "Count bits of 1 should return [0, 1].");
    }

    @Test
    public void testCountBitsWithTwo() {
        int[] expected = {0, 1, 1};
        assertArrayEquals(expected, countingBits.countBits(2), "Count bits of 2 should return [0, 1, 1].");
    }

    @Test
    public void testCountBitsWithFive() {
        int[] expected = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected, countingBits.countBits(5), "Count bits of 5 should return [0, 1, 1, 2, 1, 2].");
    }

    @Test
    public void testCountBitsWithTen() {
        int[] expected = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2};
        assertArrayEquals(expected, countingBits.countBits(10), "Count bits of 10 should return [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2].");
    }
}