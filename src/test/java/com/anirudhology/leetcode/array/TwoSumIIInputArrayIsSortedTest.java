package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIIInputArrayIsSortedTest {

    private final TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted();

    @Test
    public void testTwoSum() {
        assertArrayEquals(new int[]{1, 2}, twoSumIIInputArrayIsSorted.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, twoSumIIInputArrayIsSorted.twoSum(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, twoSumIIInputArrayIsSorted.twoSum(new int[]{-1, 0}, -1));
        assertArrayEquals(new int[]{3, 5}, twoSumIIInputArrayIsSorted.twoSum(new int[]{1, 2, 3, 4, 4}, 7));
        assertArrayEquals(new int[]{4, 5}, twoSumIIInputArrayIsSorted.twoSum(new int[]{1, 2, 3, 4, 6}, 10));

        // Edge cases
        assertNull(twoSumIIInputArrayIsSorted.twoSum(new int[]{}, 9));
        assertNull(twoSumIIInputArrayIsSorted.twoSum(null, 9));
        assertNull(twoSumIIInputArrayIsSorted.twoSum(new int[]{1}, 1));
        assertArrayEquals(new int[]{1, 2}, twoSumIIInputArrayIsSorted.twoSum(new int[]{1, 2}, 3));
    }
}