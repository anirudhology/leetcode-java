package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    
    private final LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    @Test
    public void testLongestConsecutive_EmptyArray() {
        int[] nums = {};
        assertEquals(0, longestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_SingleElement() {
        int[] nums = {1};
        assertEquals(1, longestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_NoConsecutiveSequence() {
        int[] nums = {10, 5, 100};
        assertEquals(1, longestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_ConsecutiveSequence() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        assertEquals(4, longestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_MixedNumbers() {
        int[] nums = {100, 4, 200, 1, 3, 2, 2, 2};
        assertEquals(4, longestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_Duplicates() {
        int[] nums = {1, 2, 0, 1};
        assertEquals(3, longestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_LargeRange() {
        int[] nums = {10, 1, 3, 5, 2, 4, 11};
        assertEquals(5, longestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_NullArray() {
        int[] nums = null;
        assertEquals(0, longestConsecutiveSequence.longestConsecutive(nums));
    }

}