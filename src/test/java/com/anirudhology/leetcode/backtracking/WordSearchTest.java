package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordSearchTest {

    private final WordSearch wordSearch = new WordSearch();

    @Test
    public void testExist() {
        char[][] board1 = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        // Test cases
        assertTrue(wordSearch.exist(board1, "ABCCED")); // Test normal case
        assertTrue(wordSearch.exist(board1, "SEE"));    // Test normal case
        assertFalse(wordSearch.exist(board1, "ABCB"));  // Test normal case where word does not exist
        assertFalse(wordSearch.exist(board1, "ABCD"));  // Test word not present in board

        char[][] board2 = {
                {'A'}
        };

        assertTrue(wordSearch.exist(board2, "A"));      // Test single character board and word match
        assertFalse(wordSearch.exist(board2, "B"));     // Test single character board and word does not match

        char[][] board3 = {
                {'A', 'B'},
                {'C', 'D'}
        };

        assertFalse(wordSearch.exist(board3, "ABCD"));   // Test word using all cells
        assertTrue(wordSearch.exist(board3, "ACDB"));  // Test word using all cells but not in correct order

        char[][] board4 = new char[0][0];       // Test empty board
        assertFalse(wordSearch.exist(board4, "A"));

        assertFalse(wordSearch.exist(null, "A"));       // Test null board
    }

    @Test
    public void testEmptyWord() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        assertFalse(wordSearch.exist(board, "")); // Test empty word
    }

    @Test
    public void testNullWord() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        assertFalse(wordSearch.exist(board, null)); // Test null word
    }

    @Test
    public void testWordWithDots() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        assertFalse(wordSearch.exist(board, "A.C.E")); // Test word with non-alphabet characters
    }

    @Test
    public void testOutOfBounds() {
        char[][] board = {
                {'A', 'B', 'C'},
                {'S', 'F', 'E'},
                {'A', 'D', 'E'}
        };

        assertFalse(wordSearch.exist(board, "ABCDEE")); // Test word longer than board dimensions
    }
}