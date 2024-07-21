package com.anirudhology.leetcode.slidingwindow;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        // Array to store the frequencies of characters in t
        int[] frequencies = new int[128];
        for (char c : t.toCharArray()) {
            frequencies[c]++;
        }
        // Length of the string s
        int n = s.length();
        // Left and right pointers for the sliding window
        int left = 0;
        int right = 0;
        // Start index of the window
        int start = 0;
        // Count of characters in the string t
        int count = t.length();
        // Minimum length of the window
        int minLength = Integer.MAX_VALUE;
        // Process the string
        while (right < n) {
            // If the current character is also present in t
            if (frequencies[s.charAt(right)] > 0) {
                count--;
            }
            // Reduce the frequency of this character
            frequencies[s.charAt(right)]--;
            // Expand this window
            right++;
            // If the count has reached 0, it means we have found the substring
            while (count == 0) {
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }
                // Check if the character at left exist in the substring
                if (frequencies[s.charAt(left)] == 0) {
                    count++;
                }
                frequencies[s.charAt(left)]++;
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
