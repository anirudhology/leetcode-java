package com.anirudhology.leetcode.dynamicprogramming;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        // Lookup table to keep track of number of unique paths
        // at the cell represented by {i, j}
        final int[][] lookup = new int[m][n];
        // For the first row, we can only move horizontally
        for (int j = 0; j < n; j++) {
            lookup[0][j] = 1;
        }
        // For the first column, we can only move vertically
        for (int i = 0; i < m; i++) {
            lookup[i][0] = 1;
        }
        // Populate remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                lookup[i][j] = lookup[i - 1][j] + lookup[i][j - 1];
            }
        }
        return lookup[m - 1][n - 1];
    }
}
