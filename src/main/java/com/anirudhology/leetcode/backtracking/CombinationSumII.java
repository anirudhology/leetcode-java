package com.anirudhology.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // List to store final output
        final List<List<Integer>> combinations = new ArrayList<>();
        // Special case
        if (candidates == null || candidates.length == 0) {
            return combinations;
        }
        // Sort the array
        Arrays.sort(candidates);
        // Perform backtracking
        backtrack(candidates, 0, new ArrayList<>(), combinations, target);
        return combinations;
    }

    private void backtrack(int[] candidates, int index, List<Integer> combination, List<List<Integer>> combinations, int target) {
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            combination.add(candidates[i]);
            backtrack(candidates, i + 1, combination, combinations, target - candidates[i]);
            combination.remove(combination.size() - 1);
        }
    }
}
