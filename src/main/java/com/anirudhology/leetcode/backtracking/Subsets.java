package com.anirudhology.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        // List to store the final output
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
            subset.add(nums[i]);
            backtrack(nums, i + 1, subset, powerSet);
            subset.remove(subset.size() - 1);
        }
    }
}