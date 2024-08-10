package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PartitionEqualSubsetSumTest {

    private final PartitionEqualSubsetSum partitionEqualSubsetSum = new PartitionEqualSubsetSum();

    @Test
    public void testCanPartition() {
        assertTrue(partitionEqualSubsetSum.canPartition(new int[]{1, 5, 11, 5}));
        assertFalse(partitionEqualSubsetSum.canPartition(new int[]{1, 2, 3, 5}));
        assertFalse(partitionEqualSubsetSum.canPartition(new int[]{1, 2, 5}));
        assertTrue(partitionEqualSubsetSum.canPartition(new int[]{1, 2, 3, 4}));
        assertTrue(partitionEqualSubsetSum.canPartition(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertFalse(partitionEqualSubsetSum.canPartition(new int[]{}));
        assertFalse(partitionEqualSubsetSum.canPartition(null));
        assertFalse(partitionEqualSubsetSum.canPartition(new int[]{3}));
    }
}