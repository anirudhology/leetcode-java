package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromicSubstringsTest {

    private final PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

    @Test
    public void testCountSubstrings() {
        // Test case for null string
        assertEquals(0, palindromicSubstrings.countSubstrings(null));

        // Test case for empty string
        assertEquals(0, palindromicSubstrings.countSubstrings(""));

        // Test case for single character string
        assertEquals(1, palindromicSubstrings.countSubstrings("a"));

        // Test case for string with all same characters
        assertEquals(10, palindromicSubstrings.countSubstrings("aaaa"));

        // Test case for string with mixed characters
        assertEquals(3, palindromicSubstrings.countSubstrings("abc"));

        // Test case for string with palindromic substrings
        assertEquals(6, palindromicSubstrings.countSubstrings("aaa"));
    }
}