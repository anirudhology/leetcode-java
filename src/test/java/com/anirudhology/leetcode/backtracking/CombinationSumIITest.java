package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSumIITest {

    private final CombinationSumII combinationSumII = new CombinationSumII();

    @Test
    public void testCombinationSum2() {
        // Test case 1
        int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        int target1 = 8;
        List<List<Integer>> expected1 = List.of(
                List.of(1, 1, 6),
                List.of(1, 2, 5),
                List.of(1, 7),
                List.of(2, 6)
        );
        assertEquals(expected1, combinationSumII.combinationSum2(candidates1, target1));

        // Test case 2
        int[] candidates2 = {2, 5, 2, 1, 2};
        int target2 = 5;
        List<List<Integer>> expected2 = List.of(
                List.of(1, 2, 2),
                List.of(5)
        );
        assertEquals(expected2, combinationSumII.combinationSum2(candidates2, target2));

        // Test case 3: Edge case, empty array
        int[] candidates3 = {};
        int target3 = 3;
        List<List<Integer>> expected3 = new ArrayList<>();
        assertEquals(expected3, combinationSumII.combinationSum2(candidates3, target3));

        // Test case 4: Edge case, target is zero
        int[] candidates4 = {1, 2, 3};
        int target4 = 0;
        List<List<Integer>> expected4 = List.of(
                new ArrayList<>()
        );
        assertEquals(expected4, combinationSumII.combinationSum2(candidates4, target4));

        // Test case 5: Edge case, candidates are null
        int target5 = 7;
        List<List<Integer>> expected5 = new ArrayList<>();
        assertEquals(expected5, combinationSumII.combinationSum2(null, target5));
    }
}