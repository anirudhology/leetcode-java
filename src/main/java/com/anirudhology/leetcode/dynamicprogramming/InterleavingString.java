package com.anirudhology.leetcode.dynamicprogramming;

public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {
        // Lengths of the strings
        final int m = s1.length();
        final int n = s2.length();
        // Special case
        if (m + n != s3.length()) {
            return false;
        }
        // Boolean lookup table to see if s3[0...k] can be formed by
        // s1[0...i] and s2[0...j]
        final boolean[][] lookup = new boolean[m + 1][n + 1];
        // For empty strings
        lookup[0][0] = true;
        // If s2 is empty
        for (int i = 1; i <= m; i++) {
            lookup[i][0] = lookup[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        // If s1 is empty
        for (int j = 1; j <= n; j++) {
            lookup[0][j] = lookup[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }
        // Populate the remaining table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                lookup[i][j] = (lookup[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (lookup[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
        return lookup[m][n];
    }
}
