package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwimInRisingWaterTest {

    private final SwimInRisingWater swimInRisingWater = new SwimInRisingWater();

    @Test
    public void testSwimInWater() {
        // Test case 1
        int[][] grid1 = {
                {0, 2},
                {1, 3}
        };
        int expected1 = 3;
        assertEquals(expected1, swimInRisingWater.swimInWater(grid1));

        // Test case 2
        int[][] grid2 = {
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        };
        int expected2 = 16;
        assertEquals(expected2, swimInRisingWater.swimInWater(grid2));

        // Edge case: single cell
        int[][] grid3 = {
                {0}
        };
        int expected3 = 0;
        assertEquals(expected3, swimInRisingWater.swimInWater(grid3));

        // Edge case: larger grid
        int[][] grid4 = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        int expected4 = 8;
        assertEquals(expected4, swimInRisingWater.swimInWater(grid4));
    }
}