package com.anirudhology.leetcode.dynamicprogramming;

public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return false;
        }
        // Total sum of the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // If sum is odd, partition is not possible
        if (sum % 2 != 0) {
            return false;
        }
        // Target to reach
        final int target = sum / 2;
        // Lookup table to store if the partition is possible or not
        final boolean[] lookup = new boolean[target + 1];
        // Zero is always possible
        lookup[0] = true;
        // Process the array
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                lookup[j] |= lookup[j - num];
            }
        }
        return lookup[target];
    }
}
