package com.anirudhology.leetcode.dynamicprogramming;

public class EditDistance {

    public int minDistance(String word1, String word2) {
        // Lengths of both strings
        final int m = word1.length();
        final int n = word2.length();
        // Lookup table to store the minimum number of operations
        final int[][] lookup = new int[m + 1][n + 1];
        // If word2 is empty
        for (int i = 0; i <= m; i++) {
            lookup[i][0] = i;
        }
        // If word1 is empty
        for (int j = 0; j <= n; j++) {
            lookup[0][j] = j;
        }
        // Populate the remaining table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the characters at the current indices same,
                // then we don't have to do anything
                int cost = word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1;
                lookup[i][j] = Math.min(cost + lookup[i - 1][j - 1],
                        1 + Math.min(lookup[i - 1][j], lookup[i][j - 1]));
            }
        }
        return lookup[m][n];
    }
}
