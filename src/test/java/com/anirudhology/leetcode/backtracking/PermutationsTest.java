package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationsTest {

    private final Permutations permutations = new Permutations();

    @Test
    void testPermute() {
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> expected1 = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
        assertEquals(expected1, permutations.permute(nums1));

        int[] nums2 = {0, 1};
        List<List<Integer>> expected2 = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );
        assertEquals(expected2, permutations.permute(nums2));

        int[] nums3 = {1};
        List<List<Integer>> expected3 = List.of(
                List.of(1)
        );
        assertEquals(expected3, permutations.permute(nums3));

        int[] nums4 = {};
        List<List<Integer>> expected4 = new ArrayList<>();
        assertEquals(expected4, permutations.permute(nums4));

        List<List<Integer>> expected5 = new ArrayList<>();
        assertEquals(expected5, permutations.permute(null));
    }
}