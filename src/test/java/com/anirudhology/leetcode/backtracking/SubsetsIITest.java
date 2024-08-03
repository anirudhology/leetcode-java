package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubsetsIITest {

    private final SubsetsII subsetsII = new SubsetsII();

    @Test
    void testSubsetsWithDup() {
        int[] nums1 = {1, 2, 2};
        List<List<Integer>> expected1 = List.of(
                List.of(),
                List.of(1),
                List.of(1, 2),
                List.of(1, 2, 2),
                List.of(2),
                List.of(2, 2)
        );
        assertEquals(expected1, subsetsII.subsetsWithDup(nums1));

        int[] nums2 = {4, 4, 4, 1, 4};
        List<List<Integer>> expected2 = List.of(
                List.of(),
                List.of(1),
                List.of(1, 4),
                List.of(1, 4, 4),
                List.of(1, 4, 4, 4),
                List.of(1, 4, 4, 4, 4),
                List.of(4),
                List.of(4, 4),
                List.of(4, 4, 4),
                List.of(4, 4, 4, 4)
        );
        assertEquals(expected2, subsetsII.subsetsWithDup(nums2));

        int[] nums3 = {};
        List<List<Integer>> expected3 = new ArrayList<>();
        assertEquals(expected3, subsetsII.subsetsWithDup(nums3));

        int[] nums4 = null;
        List<List<Integer>> expected4 = new ArrayList<>();
        assertEquals(expected4, subsetsII.subsetsWithDup(nums4));
    }
}