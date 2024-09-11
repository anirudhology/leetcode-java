package com.anirudhology.leetcode.slidingwindow;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        final int n = nums.length;
        // Left and right pointers of the sliding window
        int left = 0;
        int right = 0;
        // Minimal length of subarray
        int minLength = Integer.MAX_VALUE;
        // Sum of elements in the window
        int windowSum = 0;
        // Process elements in the array
        while (right < n) {
            windowSum += nums[right];
            right++;
            // Squeeze the window, if possible
            while (windowSum >= target) {
                minLength = Math.min(minLength, right - left);
                windowSum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
