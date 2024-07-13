package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {
    
    private final TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    public void testEmptyArray() {
        assertEquals(0, trappingRainWater.trap(new int[]{}));
    }

    @Test
    public void testSingleElement() {
        assertEquals(0, trappingRainWater.trap(new int[]{1}));
    }

    @Test
    public void testTwoElements() {
        assertEquals(0, trappingRainWater.trap(new int[]{1, 2}));
    }

    @Test
    public void testNoTrapping() {
        assertEquals(0, trappingRainWater.trap(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testTypicalCase() {
        assertEquals(6, trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    public void testAllSameHeight() {
        assertEquals(0, trappingRainWater.trap(new int[]{3, 3, 3, 3}));
    }

    @Test
    public void testDecreasingHeights() {
        assertEquals(0, trappingRainWater.trap(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void testIncreasingHeights() {
        assertEquals(0, trappingRainWater.trap(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testVShape() {
        assertEquals(2, trappingRainWater.trap(new int[]{2, 0, 2}));
    }

    @Test
    public void testComplexCase() {
        assertEquals(9, trappingRainWater.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}