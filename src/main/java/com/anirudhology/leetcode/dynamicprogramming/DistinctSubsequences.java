package com.anirudhology.leetcode.dynamicprogramming;

public class DistinctSubsequences {

    public int numDistinct(String s, String t) {
        // Lengths of both strings
        final int m = s.length();
        final int n = t.length();
        // Lookup table to store the number of distinct subsequences
        final int[][] lookup = new int[m + 1][n + 1];
        // Empty string t can only be valid subsequence of any other string
        // but only once
        for (int i = 0; i <= m; i++) {
            lookup[i][0] = 1;
        }
        // Empty string s can only contain empty string t as its subsequence
        lookup[0][0] = 1;
        // Populate the remaining table for every t
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= m; i++) {
                lookup[i][j] = lookup[i - 1][j];
                // If characters are same
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    lookup[i][j] += lookup[i - 1][j - 1];
                }
            }
        }
        return lookup[m][n];
    }
}

