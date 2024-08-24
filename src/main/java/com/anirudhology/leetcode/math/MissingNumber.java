package com.anirudhology.leetcode.math;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (n * (n + 1) / 2) - sum;
    }
}
