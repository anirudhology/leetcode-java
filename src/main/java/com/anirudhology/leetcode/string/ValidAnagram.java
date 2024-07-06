package com.anirudhology.leetcode.string;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // Special case
        if (s.length() != t.length()) {
            return false;
        }
        // Array to store the frequencies of characters
        final int[] frequencies = new int[26];
        // Process through both strings
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i) - 'a']++;
            frequencies[t.charAt(i) - 'a']--;
        }
        // Check if any character has non-zero frequency
        for (final int frequency : frequencies) {
            if (frequency != 0) {
                return false;
            }
        }
        return true;
    }
}
