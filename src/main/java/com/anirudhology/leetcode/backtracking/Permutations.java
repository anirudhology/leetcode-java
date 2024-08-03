package com.anirudhology.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        // List to store the final output
        final List<List<Integer>> permutations = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return permutations;
        }
        // Perform backtracking
        backtrack(nums, new ArrayList<>(), permutations);
        return permutations;
    }

    private void backtrack(int[] nums, List<Integer> permutation, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
        } else {
            for (int num : nums) {
                // Ignore duplicates
                if (permutation.contains(num)) {
                    continue;
                }
                permutation.add(num);
                backtrack(nums, permutation, permutations);
                permutation.remove(permutation.size() - 1);
            }
        }
    }
}
