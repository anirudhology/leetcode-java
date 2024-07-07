package com.anirudhology.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Check if array is not null or empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        // Map to store the difference of target and current element as key and
        // index of current element as value;
        Map<Integer, Integer> complements = new HashMap<>();
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if we have already found the difference
            if (complements.containsKey(nums[i])) {
                return new int[]{complements.get(nums[i]), i};
            }
            complements.put(target - nums[i], i);
        }
        throw new IllegalArgumentException("Invalid inputs!");
    }
}
