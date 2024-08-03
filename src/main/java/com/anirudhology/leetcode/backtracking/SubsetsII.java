package com.anirudhology.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // List to store final output
        final List<List<Integer>> powerSet = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return powerSet;
        }
        // Sort the array
        Arrays.sort(nums);
        // Perform backtracking
        backtrack(nums, 0, new ArrayList<>(), powerSet);
        return powerSet;
    }

    private void backtrack(int[] nums, int index, List<Integer> subset, List<List<Integer>> powerSet) {
        powerSet.add(new ArrayList<>(subset));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            backtrack(nums, i + 1, subset, powerSet);
            subset.remove(subset.size() - 1);
        }
    }
}
