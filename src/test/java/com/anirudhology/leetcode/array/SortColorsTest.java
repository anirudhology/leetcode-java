package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortColorsTest {

    private final SortColors sortColors = new SortColors();

    @Test
    public void testSortColorsAllZeros() {
        int[] nums = {0, 0, 0};
        assertArrayEquals(new int[]{0, 0, 0}, sortColors.sortColors(nums));
    }

    @Test
    public void testSortColorsAllOnes() {
        int[] nums = {1, 1, 1};
        assertArrayEquals(new int[]{1, 1, 1}, sortColors.sortColors(nums));
    }

    @Test
    public void testSortColorsAllTwos() {
        int[] nums = {2, 2, 2};
        assertArrayEquals(new int[]{2, 2, 2}, sortColors.sortColors(nums));
    }

    @Test
    public void testSortColorsMixed() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, sortColors.sortColors(nums));
    }

    @Test
    public void testSortColorsEmptyArray() {
        int[] nums = {};
        assertArrayEquals(new int[]{}, sortColors.sortColors(nums));
    }

    @Test
    public void testSortColorsSingleElement() {
        int[] nums = {1};
        assertArrayEquals(new int[]{1}, sortColors.sortColors(nums));
    }

    @Test
    public void testSortColorsAlreadySorted() {
        int[] nums = {0, 1, 2};
        assertArrayEquals(new int[]{0, 1, 2}, sortColors.sortColors(nums));
    }
}