package com.anirudhology.leetcode.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfIslandsTest {

    private final NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    public void testEmptyGrid() {
        assertEquals(0, numberOfIslands.numIslands(new char[][]{}));
    }

    @Test
    public void testNullGrid() {
        assertEquals(0, numberOfIslands.numIslands(null));
    }

    @Test
    public void testSingleIsland() {
        char[][] grid = {
                {'1', '1', '0', '0'},
                {'1', '1', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        assertEquals(1, numberOfIslands.numIslands(grid));
    }

    @Test
    public void testMultipleIslands() {
        char[][] grid = {
                {'1', '1', '0', '0', '1'},
                {'1', '0', '0', '1', '1'},
                {'0', '0', '1', '0', '0'},
                {'1', '0', '0', '1', '1'}
        };
        assertEquals(5, numberOfIslands.numIslands(grid));
    }

    @Test
    public void testNoIslands() {
        char[][] grid = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        assertEquals(0, numberOfIslands.numIslands(grid));
    }

    @Test
    public void testMixedGrid() {
        char[][] grid = {
                {'1', '0', '1', '0'},
                {'0', '1', '0', '1'},
                {'1', '0', '1', '0'}
        };
        assertEquals(6, numberOfIslands.numIslands(grid));
    }
}