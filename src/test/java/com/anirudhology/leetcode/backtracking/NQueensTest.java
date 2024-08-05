package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NQueensTest {

    private final NQueens nQueens = new NQueens();

    @Test
    public void testSolveNQueens() {
        // Test case 1: n = 4
        List<List<String>> result1 = nQueens.solveNQueens(4);
        List<List<String>> expected1 = List.of(
                List.of("..Q.", "Q...", "...Q", ".Q.."),
                List.of(".Q..", "...Q", "Q...", "..Q.")
        );
        assertEquals(expected1, result1);

        // Test case 2: n = 1
        List<List<String>> result2 = nQueens.solveNQueens(1);
        List<List<String>> expected2 = List.of(
                List.of("Q")
        );
        assertEquals(expected2, result2);

        // Test case 3: n = 0
        List<List<String>> result3 = nQueens.solveNQueens(0);
        List<List<String>> expected3 = new ArrayList<>();
        assertEquals(expected3, result3);

        // Test case 4: n = 2 (no solution)
        List<List<String>> result4 = nQueens.solveNQueens(2);
        List<List<String>> expected4 = new ArrayList<>();
        assertEquals(expected4, result4);

        // Test case 5: n = 3 (no solution)
        List<List<String>> result5 = nQueens.solveNQueens(3);
        List<List<String>> expected5 = new ArrayList<>();
        assertEquals(expected5, result5);
    }
}