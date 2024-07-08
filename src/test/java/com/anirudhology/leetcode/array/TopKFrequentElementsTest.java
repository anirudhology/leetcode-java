package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {
    
    private final TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    public void testTopKFrequentBasicScenario() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};
        int[] result = topKFrequentElements.topKFrequent(nums, k);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTopKFrequentSingleElement() {
        int[] nums = {5};
        int k = 1;
        int[] expected = {5};
        int[] result = topKFrequentElements.topKFrequent(nums, k);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTopKFrequentKEqualsOneWithNegativeNumbers() {
        int[] nums = {-1, -1};
        int k = 1;
        int[] expected = {-1};
        int[] result = topKFrequentElements.topKFrequent(nums, k);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTopKFrequentInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> topKFrequentElements.topKFrequent(null, 3));
    }
}