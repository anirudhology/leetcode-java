package com.anirudhology.leetcode.dynamicprogramming;

public class HouseRobber {

    public int rob(int[] nums) {
        // Total number of houses
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        // Lookup table for remaining houses
        int[] lookup = new int[n];
        lookup[0] = nums[0];
        lookup[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            lookup[i] = Math.max(nums[i] + lookup[i - 2], lookup[i - 1]);
        }
        return lookup[n - 1];
    }
}
