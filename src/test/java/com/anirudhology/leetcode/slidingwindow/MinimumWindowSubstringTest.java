package com.anirudhology.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    private final MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

    @Test
    void testMinWindowSubstring() {
        // Test case 1: Basic functionality
        assertEquals("BANC", minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));

        // Test case 2: t is longer than s
        assertEquals("", minimumWindowSubstring.minWindow("A", "AA"));

        // Test case 3: t and s are the same
        assertEquals("A", minimumWindowSubstring.minWindow("A", "A"));

        // Test case 4: t is a substring of s
        assertEquals("BANC", minimumWindowSubstring.minWindow("BANC", "ABC"));

        // Test case 5: No possible window
        assertEquals("", minimumWindowSubstring.minWindow("HELLOWORLD", "XYZ"));

        // Test case 6: Both s and t are empty
        assertEquals("", minimumWindowSubstring.minWindow("", ""));

        // Test case 7: Characters in t are repeated
        assertEquals("AA", minimumWindowSubstring.minWindow("AAABBB", "AA"));

        // Test case 8: Characters in s are repeated and t is a subset
        assertEquals("AABC", minimumWindowSubstring.minWindow("AABCAD", "AABC"));

        // Test case 9: s and t have no common characters
        assertEquals("", minimumWindowSubstring.minWindow("ABC", "DEF"));

        // Test case 10: t contains all unique characters
        assertEquals("ADOBEC", minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABCDE"));
    }
}