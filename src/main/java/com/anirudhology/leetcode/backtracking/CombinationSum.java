package com.anirudhology.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // List to store final output
        final List<List<Integer>> result = new ArrayList<>();
        // Special case
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        // Sort the array
        Arrays.sort(candidates);
        // Perform backtracking
        backtrack(candidates, 0, new ArrayList<>(), target, result);
        return result;
    }

    private void backtrack(int[] candidates, int index, List<Integer> combination, int target, List<List<Integer>> result) {
        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]);
            // Since we are allowing duplicates, we won't increment i
            backtrack(candidates, i, combination, target - candidates[i], result);
            combination.remove(combination.size() - 1);
        }
    }
}
