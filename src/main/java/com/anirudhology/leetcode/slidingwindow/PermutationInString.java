package com.anirudhology.leetcode.slidingwindow;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        // Special case
        if (s1.length() > s2.length()) {
            return false;
        }
        // Array to store the frequencies of s1
        int[] frequencies = new int[26];
        for (char c : s1.toCharArray()) {
            frequencies[c - 'a']++;
        }
        // Left and right pointers for the sliding window
        int left = 0;
        int right = 0;
        // Process the string
        while (right < s2.length()) {
            int frequency = frequencies[s2.charAt(right) - 'a'];
            frequency--;
            while (left < s2.length() && frequency < 0) {
                frequencies[s2.charAt(left) - 'a']++;
                left++;
            }
            // Check if we have found the s1 in s2
            if (right - left + 1 == s1.length()) {
                return true;
            }
            right++;
        }
        return false;
    }
}
