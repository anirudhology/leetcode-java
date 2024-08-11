package com.anirudhology.leetcode.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAreaOfIslandTest {

    private final MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();

    @Test
    public void testEmptyGrid() {
        assertEquals(0, maxAreaOfIsland.maxAreaOfIsland(new int[][]{}));
    }

    @Test
    public void testNullGrid() {
        assertEquals(0, maxAreaOfIsland.maxAreaOfIsland(null));
    }

    @Test
    public void testSingleIsland() {
        int[][] grid = {
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        assertEquals(4, maxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    public void testMultipleIslands() {
        int[][] grid = {
                {1, 0, 0, 1, 1},
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 0},
                {1, 1, 0, 1, 1}
        };
        assertEquals(4, maxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    public void testNoIslands() {
        int[][] grid = {
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        assertEquals(0, maxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    public void testMixedGrid() {
        int[][] grid = {
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0}
        };
        assertEquals(1, maxAreaOfIsland.maxAreaOfIsland(grid));
    }
}