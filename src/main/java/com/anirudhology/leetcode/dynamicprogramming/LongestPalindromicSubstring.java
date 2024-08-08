package com.anirudhology.leetcode.dynamicprogramming;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Length of the string
        int n = s.length();
        // Start and end pointers of the longest palindromic substring
        int start = 0;
        int end = 0;
        // Process the string
        for (int i = 0; i < n; i++) {
            // Length of longest palindromic substring when length
            // of s is odd and even respectively
            int oddLength = expandFromCenter(s, i, i);
            int evenLength = expandFromCenter(s, i, i + 1);
            // Max length
            int maxLength = Math.max(oddLength, evenLength);
            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        if (left > right) {
            return 0;
        }
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
