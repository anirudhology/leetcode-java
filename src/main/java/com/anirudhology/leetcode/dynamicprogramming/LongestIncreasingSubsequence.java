package com.anirudhology.leetcode.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        final int n = nums.length;
        // Lookup table to store LIS until the current index
        final int[] lookup = new int[n];
        // Since every element is an LIS of length 1
        Arrays.fill(lookup, 1);
        // Populate the remaining table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lookup[i] = Math.max(lookup[i], 1 + lookup[j]);
                }
            }
        }
        // Find maximum of all the subsequences lengths
        int lisLength = 0;
        for (int element : lookup) {
            lisLength = Math.max(element, lisLength);
        }
        return lisLength;
    }
}
