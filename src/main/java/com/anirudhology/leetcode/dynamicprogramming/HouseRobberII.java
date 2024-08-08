package com.anirudhology.leetcode.dynamicprogramming;

public class HouseRobberII {

    public int rob(int[] nums) {
        // Total number of houses
        int n = nums.length;
        // Special cases
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        // Include first house in the loot
        int include = robHelper(nums, 0, n - 2);
        // Exclude first house in the loot
        int exclude = robHelper(nums, 1, n - 1);
        return Math.max(include, exclude);
    }

    private int robHelper(int[] nums, int start, int end) {
        // Variable to store the loot when the house is
        // included or excluded
        int previous = 0;
        int current = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(previous + nums[i], current);
            previous = current;
            current = temp;
        }
        return current;
    }
}
