package com.anirudhology.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDuplicateNumberTest {

    private final FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();

    @Test
    public void testFindDuplicateSingleDuplicate() {
        int[] nums = {1, 3, 4, 2, 2};
        assertEquals(2, findTheDuplicateNumber.findDuplicate(nums));
    }

    @Test
    public void testFindDuplicateMultipleDuplicates() {
        int[] nums = {3, 1, 3, 4, 2};
        assertEquals(3, findTheDuplicateNumber.findDuplicate(nums));
    }

    @Test
    public void testFindDuplicateAtStart() {
        int[] nums = {1, 1};
        assertEquals(1, findTheDuplicateNumber.findDuplicate(nums));
    }

    @Test
    public void testFindDuplicateLargeInput() {
        int[] nums = {1, 3, 4, 2, 2};
        assertEquals(2, findTheDuplicateNumber.findDuplicate(nums));
    }

    @Test
    public void testFindDuplicateSingleNumber() {
        int[] nums = {1, 1};
        assertEquals(1, findTheDuplicateNumber.findDuplicate(nums));
    }

    @Test
    public void testFindDuplicateRandomOrder() {
        int[] nums = {4, 2, 1, 3, 2};
        assertEquals(2, findTheDuplicateNumber.findDuplicate(nums));
    }
}