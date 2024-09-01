package com.anirudhology.leetcode.dynamicprogramming;

public class LongestIncreasingPathInAMatrix {

    public int longestIncreasingPath(int[][] matrix) {
        // Dimensions of the matrix
        final int m = matrix.length;
        final int n = matrix[0].length;
        // Lookup table to store the longest increasing path
        final int[][] lookup = new int[m][n];
        // Maximum distance of a path
        int maxPath = 1;
        // Traverse through every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentPath = dfs(matrix, i, j, m, n, lookup);
                maxPath = Math.max(currentPath, maxPath);
            }
        }
        return maxPath;
    }

    private int dfs(int[][] matrix, int i, int j, int m, int n, int[][] lookup) {
        // We have already calculated this cell
        if (lookup[i][j] != 0) {
            return lookup[i][j];
        }
        final int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        int length = 1;
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            // Check for boundary conditions
            if (x < 0 || x >= m || y < 0 || y >= n) {
                continue;
            }
            if (matrix[x][y] <= matrix[i][j]) {
                continue;
            }
            length = Math.max(length, dfs(matrix, x, y, m, n, lookup) + 1);
        }
        lookup[i][j] = length;
        return length;
    }
}
