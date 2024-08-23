package com.anirudhology.leetcode.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Map to keep track of overlapping subproblem
        final Map<String, Integer> lookup = new HashMap<>();
        return evaluate(nums, target, 0, lookup);
    }

    private int evaluate(int[] nums, int target, int index, Map<String, Integer> lookup) {
        // Base case
        if (index >= nums.length) {
            return target == 0 ? 1 : 0;
        }
        // For overlapping subproblem
        String key = index + "-" + target;
        if (lookup.containsKey(key)) {
            return lookup.get(key);
        }
        // Solve for both positive and negative signs
        int ways = evaluate(nums, target - nums[index], index + 1, lookup) +
                evaluate(nums, target + nums[index], index + 1, lookup);
        // Store the result in lookup
        lookup.put(key, ways);
        return ways;
    }
}
