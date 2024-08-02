package com.anirudhology.leetcode.backtracking;

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.isEmpty()) {
            return false;
        }
        // Dimensions of the board
        int m = board.length;
        int n = board[0].length;
        // Process the elements in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && search(board, i, j, m, n, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int i, int j, int m, int n, String word, int index) {
        // Base case
        if (index == word.length()) {
            return true;
        }
        // For out of bound indices
        if (i >= m || i < 0 || j >= n || j < 0 || board[i][j] != word.charAt(index)) {
            return false;
        }
        // Already visited this node
        if (board[i][j] == '#') {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        // Search in all four directions
        boolean found = search(board, i - 1, j, m, n, word, index + 1)
                || search(board, i + 1, j, m, n, word, index + 1)
                || search(board, i, j - 1, m, n, word, index + 1)
                || search(board, i, j + 1, m, n, word, index + 1);
        board[i][j] = temp;
        return found;
    }
}
