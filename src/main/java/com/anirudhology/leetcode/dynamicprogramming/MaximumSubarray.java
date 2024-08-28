package com.anirudhology.leetcode.dynamicprogramming;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        // Local and global maxima
        int localMaxima = nums[0];
        int globalMaxima = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localMaxima = Math.max(localMaxima + nums[i], nums[i]);
            globalMaxima = Math.max(localMaxima, globalMaxima);
        }
        return globalMaxima;
    }
}
