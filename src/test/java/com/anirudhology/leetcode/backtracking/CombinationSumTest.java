package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSumTest {

    private final CombinationSum combinationSum = new CombinationSum();

    @Test
    void testCombinationSum() {
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        List<List<Integer>> expected1 = List.of(
                List.of(2, 2, 3),
                List.of(7)
        );
        assertEquals(expected1, combinationSum.combinationSum(candidates1, target1));

        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        List<List<Integer>> expected2 = List.of(
                List.of(2, 2, 2, 2),
                List.of(2, 3, 3),
                List.of(3, 5)
        );
        assertEquals(expected2, combinationSum.combinationSum(candidates2, target2));

        int[] candidates3 = {2};
        int target3 = 1;
        List<List<Integer>> expected3 = List.of();
        assertEquals(expected3, combinationSum.combinationSum(candidates3, target3));

        int[] candidates4 = {};
        int target4 = 7;
        List<List<Integer>> expected4 = List.of();
        assertEquals(expected4, combinationSum.combinationSum(candidates4, target4));
    }
}