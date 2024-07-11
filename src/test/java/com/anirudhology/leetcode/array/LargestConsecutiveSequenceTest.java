package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestConsecutiveSequenceTest {
    
    private final LargestConsecutiveSequence largestConsecutiveSequence = new LargestConsecutiveSequence();

    @Test
    public void testLongestConsecutive_EmptyArray() {
        int[] nums = {};
        assertEquals(0, largestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_SingleElement() {
        int[] nums = {1};
        assertEquals(1, largestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_NoConsecutiveSequence() {
        int[] nums = {10, 5, 100};
        assertEquals(1, largestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_ConsecutiveSequence() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        assertEquals(4, largestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_MixedNumbers() {
        int[] nums = {100, 4, 200, 1, 3, 2, 2, 2};
        assertEquals(4, largestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_Duplicates() {
        int[] nums = {1, 2, 0, 1};
        assertEquals(3, largestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_LargeRange() {
        int[] nums = {10, 1, 3, 5, 2, 4, 11};
        assertEquals(5, largestConsecutiveSequence.longestConsecutive(nums));
    }

    @Test
    public void testLongestConsecutive_NullArray() {
        int[] nums = null;
        assertEquals(0, largestConsecutiveSequence.longestConsecutive(nums));
    }

}