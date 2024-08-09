package com.anirudhology.leetcode.dynamicprogramming;

public class DecodeWays {

    public int numDecodings(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Length of the string
        final int n = s.length();
        // Variables to keep track of current and next characters
        int previous = 1;
        int current = 0;
        // Process the string
        for (int i = n - 1; i >= 0; i--) {
            int temp = s.charAt(i) == '0' ? 0 : previous;
            if (i < n - 1 && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
                temp += current;
            }
            current = previous;
            previous = temp;
        }
        return previous;
    }
}
