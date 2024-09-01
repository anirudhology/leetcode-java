package com.anirudhology.leetcode.dynamicprogramming;

public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        // Lengths of both strings
        final int m = s.length();
        final int n = p.length();
        // Lookup table to check if s[0...i] matches with patters p[0...j]
        final boolean[][] lookup = new boolean[m + 1][n + 1];
        // Empty string and empty pattern are a match
        lookup[0][0] = true;
        // For empty string s and pattern with *
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                lookup[0][j] = lookup[0][j - 2];
            }
        }
        // Populate the remaining table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters are matching or we have period in pattern
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    // We will see if the previous strings are matching or not
                    lookup[i][j] = lookup[i - 1][j - 1];
                }
                // If we are matching star
                else if (j > 1 && p.charAt(j - 1) == '*') {
                    lookup[i][j] = lookup[i][j - 2];
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        lookup[i][j] = lookup[i][j] | lookup[i - 1][j];
                    }
                }
            }
        }
        return lookup[m][n];
    }
}
