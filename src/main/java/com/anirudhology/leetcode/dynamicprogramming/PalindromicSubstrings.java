package com.anirudhology.leetcode.dynamicprogramming;

public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Count of palindromic substrings
        int count = 0;
        // Process the string by considering each index
        // as the middle and expand in both directions
        for (int i = 0; i < s.length(); i++) {
            count += expandFromCenter(s, i, i); // Odd length
            count += expandFromCenter(s, i, i + 1); // Even length
        }
        return count;
    }

    private int expandFromCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}
