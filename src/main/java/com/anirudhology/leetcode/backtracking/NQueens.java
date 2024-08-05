package com.anirudhology.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        // List to store the combinations
        final List<List<String>> combinations = new ArrayList<>();
        // Special case
        if (n == 0) {
            return combinations;
        }
        // Create the chessboard
        final char[][] board = new char[n][n];
        Arrays.stream(board).forEach(a -> Arrays.fill(a, '.'));
        // Perform backtracking
        backtrack(board, 0, combinations);
        return combinations;
    }

    private void backtrack(char[][] board, int index, List<List<String>> combinations) {
        // Base case
        if (index == board.length) {
            combinations.add(build(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (check(board, i, index)) {
                board[i][index] = 'Q';
                backtrack(board, index + 1, combinations);
                board[i][index] = '.';
            }
        }
    }

    private boolean check(char[][] board, int row, int column) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == 'Q' && (row + j == column + i || row + column == i + j || row == i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<String> build(char[][] board) {
        List<String> combination = new ArrayList<>();
        for (char[] chars : board) {
            combination.add(new String(chars));
        }
        return combination;
    }
}
