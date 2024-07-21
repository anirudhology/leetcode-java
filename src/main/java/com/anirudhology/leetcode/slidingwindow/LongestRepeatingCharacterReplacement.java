package com.anirudhology.leetcode.slidingwindow;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        // Special case
        if (s == null || s.isEmpty() || k < 0) {
            return 0;
        }
        // Left and right pointers of the sliding window
        int left = 0;
        int right = 0;
        // Longest length
        int longestLength = 0;
        // Count of the most popular character so far
        int maxCount = 0;
        // Array to store the frequencies of all characters
        final int[] frequencies = new int[26];
        // Process the string from left to right
        while (right < s.length()) {
            // Frequency of the current characters
            int frequency = ++frequencies[s.charAt(right) - 'A'];
            // Update the maxCount
            maxCount = Math.max(maxCount, frequency);
            // If there are more than k characters that are not the same as
            // the most popular character, we shift the window
            while (right - left + 1 - maxCount > k) {
                frequencies[s.charAt(left) - 'A']--;
                left++;
            }
            longestLength = Math.max(longestLength, right - left + 1);
            right++;
        }
        return longestLength;
    }
}
