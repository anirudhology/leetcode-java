package com.anirudhology.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpGameIITest {

    private final JumpGameII jumpGameII = new JumpGameII();

    @Test
    public void testSingleElementArray() {
        int[] nums = {0};
        assertEquals(0, jumpGameII.jump(nums));
    }

    @Test
    public void testMultipleJumpsRequired() {
        int[] nums = {2, 3, 1, 1, 4};
        assertEquals(2, jumpGameII.jump(nums));
    }

    @Test
    public void testMaximumJumpAtEachStep() {
        int[] nums = {5, 4, 3, 2, 1, 0};
        assertEquals(1, jumpGameII.jump(nums));
    }

    @Test
    public void testArrayWithZerosNotBlockingPath() {
        int[] nums = {2, 0, 2, 0, 1};
        assertEquals(2, jumpGameII.jump(nums));
    }
}