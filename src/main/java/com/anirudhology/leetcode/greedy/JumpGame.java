package com.anirudhology.leetcode.greedy;

public class JumpGame {

    public boolean canJump(int[] nums) {
        // Current jump
        int jump = nums[0];
        // Process through the remaining array
        for (int i = 1; i < nums.length; i++) {
            if (jump < i) {
                return false;
            }
            jump = Math.max(jump, i + nums[i]);
        }
        return true;
    }
}
