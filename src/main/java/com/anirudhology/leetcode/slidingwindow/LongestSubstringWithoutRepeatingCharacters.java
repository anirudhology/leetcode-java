package com.anirudhology.leetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Length of the string
        final int n = s.length();
        // Set to store the characters of the window
        final Set<Character> uniques = new HashSet<>();
        // Slow and fast pointers for the sliding window
        int slow = 0;
        int fast = 0;
        // Longest length of substring
        int longestSubstringLength = 0;
        // Process the string
        while (fast < n) {
            while (fast < n && !uniques.contains(s.charAt(fast))) {
                uniques.add(s.charAt(fast));
                fast++;
            }
            longestSubstringLength = Math.max(longestSubstringLength, uniques.size());
            // Remove character from the left
            uniques.remove(s.charAt(slow));
            slow++;
        }
        return longestSubstringLength;
    }
}
