package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetSumTest {

    private final TargetSum targetSum = new TargetSum();

    @Test
    public void testFindTargetSumWays_SimpleCase() {
        assertEquals(5, targetSum.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    @Test
    public void testFindTargetSumWays_EmptyArray() {
        assertEquals(0, targetSum.findTargetSumWays(new int[]{}, 3));
    }

    @Test
    public void testFindTargetSumWays_NullArray() {
        assertEquals(0, targetSum.findTargetSumWays(null, 3));
    }

    @Test
    public void testFindTargetSumWays_NoSolution() {
        assertEquals(0, targetSum.findTargetSumWays(new int[]{1, 2, 3}, 7));
    }

    @Test
    public void testFindTargetSumWays_SingleElementTargetMet() {
        assertEquals(1, targetSum.findTargetSumWays(new int[]{5}, 5));
    }

    @Test
    public void testFindTargetSumWays_SingleElementTargetNotMet() {
        assertEquals(0, targetSum.findTargetSumWays(new int[]{5}, 3));
    }
}