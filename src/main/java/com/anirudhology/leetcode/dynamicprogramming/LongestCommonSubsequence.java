package com.anirudhology.leetcode.dynamicprogramming;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        // Lengths of both the strings
        final int m = text1.length();
        final int n = text2.length();
        // Lookup table to store longest length until index i of text1
        // and index j of text2
        final int[][] lookup = new int[m + 1][n + 1];
        // Populate the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If both the characters are same, then we need to just
                // add 1 to the value at i - 1, j - 1
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lookup[i][j] = 1 + lookup[i - 1][j - 1];
                }
                // Else, we will take the maximum of previous row and previous
                // column value
                else {
                    lookup[i][j] = Math.max(lookup[i - 1][j], lookup[i][j - 1]);
                }
            }
        }
        return lookup[m][n];
    }
}
