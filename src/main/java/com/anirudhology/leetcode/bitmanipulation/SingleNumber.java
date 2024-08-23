package com.anirudhology.leetcode.bitmanipulation;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer ^= nums[i];
        }
        return answer;
    }
}
