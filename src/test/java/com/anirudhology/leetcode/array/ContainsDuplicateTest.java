package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void testNullArray() {
        assertFalse(containsDuplicate.containsDuplicate(null), "Null array should return false");
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertFalse(containsDuplicate.containsDuplicate(nums), "Empty array should return false");
    }

    @Test
    public void testNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        assertFalse(containsDuplicate.containsDuplicate(nums), "Array with no duplicates should return false");
    }

    @Test
    public void testWithDuplicates() {
        int[] nums = {1, 2, 3, 4, 1};
        assertTrue(containsDuplicate.containsDuplicate(nums), "Array with duplicates should return true");
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        assertFalse(containsDuplicate.containsDuplicate(nums), "Array with a single element should return false");
    }

    @Test
    public void testMultipleDuplicates() {
        int[] nums = {1, 1, 1, 1, 1};
        assertTrue(containsDuplicate.containsDuplicate(nums), "Array with all elements being the same should return true");
    }
}