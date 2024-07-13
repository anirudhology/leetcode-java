package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    
    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void testMaxAreaNullArray() {
        assertEquals(0, containerWithMostWater.maxArea(null));
    }

    @Test
    public void testMaxAreaEmptyArray() {
        assertEquals(0, containerWithMostWater.maxArea(new int[] {}));
    }

    @Test
    public void testMaxAreaSingleElement() {
        assertEquals(0, containerWithMostWater.maxArea(new int[] { 1 }));
    }

    @Test
    public void testMaxAreaTwoElements() {
        assertEquals(1, containerWithMostWater.maxArea(new int[] { 1, 1 }));
    }

    @Test
    public void testMaxAreaTypicalCase() {
        assertEquals(49, containerWithMostWater.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }

    @Test
    public void testMaxAreaDecreasingHeights() {
        assertEquals(20, containerWithMostWater.maxArea(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }));
    }

    @Test
    public void testMaxAreaIncreasingHeights() {
        assertEquals(20, containerWithMostWater.maxArea(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
    }

    @Test
    public void testMaxAreaSameHeights() {
        assertEquals(16, containerWithMostWater.maxArea(new int[] { 4, 4, 4, 4, 4 }));
    }

    @Test
    public void testMaxAreaSingleHighElement() {
        assertEquals(4, containerWithMostWater.maxArea(new int[] { 1, 2, 4, 3 }));
    }
}
