package com.anirudhology.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeTripletsToFormTargetTripletTest {

    private final MergeTripletsToFormTargetTriplet mergeTripletsToFormTargetTriplet = new MergeTripletsToFormTargetTriplet();

    @Test
    public void testMergeTripletsAllPresent() {
        int[][] triplets = {{2, 5, 3}, {1, 8, 4}, {1, 7, 5}};
        int[] target = {2, 7, 5};
        assertTrue(mergeTripletsToFormTargetTriplet.mergeTriplets(triplets, target));
    }

    @Test
    public void testMergeTripletsNotAllPresent() {
        int[][] triplets = {{2, 3, 4}, {1, 2, 3}, {1, 2, 3}};
        int[] target = {3, 2, 5};
        assertFalse(mergeTripletsToFormTargetTriplet.mergeTriplets(triplets, target));
    }

    @Test
    public void testMergeTripletsSingleTripletMatch() {
        int[][] triplets = {{2, 5, 3}};
        int[] target = {2, 5, 3};
        assertTrue(mergeTripletsToFormTargetTriplet.mergeTriplets(triplets, target));
    }

    @Test
    public void testMergeTripletsEmptyTriplets() {
        int[][] triplets = {};
        int[] target = {1, 2, 3};
        assertFalse(mergeTripletsToFormTargetTriplet.mergeTriplets(triplets, target));
    }

    @Test
    public void testMergeTripletsLargeValues() {
        int[][] triplets = {{100000, 100000, 100000}, {99999, 99999, 99999}};
        int[] target = {100000, 100000, 100000};
        assertTrue(mergeTripletsToFormTargetTriplet.mergeTriplets(triplets, target));
    }

    @Test
    public void testMergeTripletsZeroTarget() {
        int[][] triplets = {{0, 0, 0}, {1, 1, 1}, {0, 1, 0}};
        int[] target = {0, 0, 0};
        assertTrue(mergeTripletsToFormTargetTriplet.mergeTriplets(triplets, target));
    }
}