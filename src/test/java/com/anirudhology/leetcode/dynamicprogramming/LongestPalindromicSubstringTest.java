package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void testLongestPalindrome() {
        // Test case for null string
        assertNull(longestPalindromicSubstring.longestPalindrome(null));

        // Test case for empty string
        assertEquals("", longestPalindromicSubstring.longestPalindrome(""));

        // Test case for single character string
        assertEquals("a", longestPalindromicSubstring.longestPalindrome("a"));

        // Test case for string with all same characters
        assertEquals("aaaa", longestPalindromicSubstring.longestPalindrome("aaaa"));

        // Test case for string with a palindromic substring in the middle
        assertEquals("aba", longestPalindromicSubstring.longestPalindrome("babad"));

        // Test case for string with a palindromic substring at the end
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));

        // Test case for string with no palindromic substring longer than one character
        assertEquals("c", longestPalindromicSubstring.longestPalindrome("abc"));

        // Test case for string with the entire string as a palindrome
        assertEquals("racecar", longestPalindromicSubstring.longestPalindrome("racecar"));
    }
}