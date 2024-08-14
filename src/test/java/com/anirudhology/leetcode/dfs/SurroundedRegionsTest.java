package com.anirudhology.leetcode.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SurroundedRegionsTest {

    private final SurroundedRegions surroundedRegions = new SurroundedRegions();
    
    @Test
    void testSolveEmptyBoard() {
        char[][] board = {};
        assertArrayEquals(board, surroundedRegions.solve(board));
    }

    @Test
    void testSolveNullBoard() {
        assertNull(surroundedRegions.solve(null));
    }

    @Test
    void testSolveSingleCellO() {
        char[][] board = {{'O'}};
        char[][] expected = {{'O'}};
        assertArrayEquals(expected, surroundedRegions.solve(board));
    }

    @Test
    void testSolveSingleCellX() {
        char[][] board = {{'X'}};
        char[][] expected = {{'X'}};
        assertArrayEquals(expected, surroundedRegions.solve(board));
    }

    @Test
    void testSolveSmallBoard() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, surroundedRegions.solve(board));
    }
}