package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    private final ThreeSum threeSum = new ThreeSum();

    @Test
    public void testThreeSumWithValidTriplets() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        assertEquals(expected, threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    public void testThreeSumWithNoTriplets() {
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, threeSum.threeSum(new int[]{1, 2, -2, -1}));
    }

    @Test
    public void testThreeSumWithAllZeros() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));
        assertEquals(expected, threeSum.threeSum(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void testThreeSumWithLessThanThreeElements() {
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, threeSum.threeSum(new int[]{1, 2}));
    }

    @Test
    public void testThreeSumWithNoElements() {
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, threeSum.threeSum(new int[]{}));
    }

    @Test
    public void testThreeSumWithNullInput() {
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, threeSum.threeSum(null));
    }

    @Test
    public void testThreeSumWithDuplicateTriplets() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-2, 0, 2));
        expected.add(Arrays.asList(-2, 1, 1));
        assertEquals(expected, threeSum.threeSum(new int[]{-2, 0, 0, 2, 2, 1, -2, -2, 1}));
    }

    @Test
    public void testThreeSumWithSingleZero() {
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, threeSum.threeSum(new int[]{0}));
    }

    @Test
    public void testThreeSumWithTwoZeros() {
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, threeSum.threeSum(new int[]{0, 0}));
    }
}
