package com.anirudhology.leetcode.greedy;

public class JumpGameII {

    public int jump(int[] nums) {
        // Total number of jumps requires
        int jumps = 0;
        // Pointers for the window
        int left = 0;
        int right = 0;
        // Process the elements in the array
        while (right < nums.length - 1) {
            // longest jump from the current position
            int longest = 0;
            // Now, we will try every position in this window
            for (int i = left; i <= right; i++) {
                longest = Math.max(longest, i + nums[i]);
            }
            // Update the pointers for new window
            left = right + 1;
            right = longest;
            jumps++;
        }
        return jumps;
    }
}
