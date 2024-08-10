package com.anirudhology.leetcode.dynamicprogramming;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Both positive and negative numbers can contribute to the
        // maximum product subarray, hence we will maintain max and
        // min products calculated so far
        double currentMax = 1;
        double currentMin = 1;
        // Final maximum product
        double maxProduct = nums[0];
        // Process the array
        for (int num : nums) {
            // Handle zero
            // Keep track of current max
            double temp = currentMax;
            // Update current max and min values by considering the
            // current element
            currentMax = Math.max(num, Math.max(num * currentMax, num * currentMin));
            currentMin = Math.min(num, Math.min(num * temp, num * currentMin));
            // Update maxProduct until current index
            maxProduct = Math.max(currentMax, maxProduct);
        }
        return (int)maxProduct;
    }
}
