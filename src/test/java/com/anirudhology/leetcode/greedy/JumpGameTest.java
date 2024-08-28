package com.anirudhology.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JumpGameTest {

    private final JumpGame jumpGame = new JumpGame();

    @Test
    public void testSingleElementArray() {
        int[] nums = {0};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void testAllZerosExceptFirst() {
        int[] nums = {1, 0, 0, 0};
        assertFalse(jumpGame.canJump(nums));
    }

    @Test
    public void testSufficientJumps() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    public void testInsufficientJumps() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(jumpGame.canJump(nums));
    }
}