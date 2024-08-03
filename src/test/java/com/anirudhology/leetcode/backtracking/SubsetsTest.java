package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubsetsTest {

    private final Subsets subsets = new Subsets();

    @Test
    void testSubsets() {
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> expected1 = List.of(
                List.of(),
                List.of(1),
                List.of(1, 2),
                List.of(1, 2, 3),
                List.of(1, 3),
                List.of(2),
                List.of(2, 3),
                List.of(3)
        );
        assertEquals(expected1, subsets.subsets(nums1));

        int[] nums2 = {0};
        List<List<Integer>> expected2 = List.of(
                List.of(),
                List.of(0)
        );
        assertEquals(expected2, subsets.subsets(nums2));

        int[] nums3 = {};
        List<List<Integer>> expected3 = List.of();
        assertEquals(expected3, subsets.subsets(nums3));
    }
}