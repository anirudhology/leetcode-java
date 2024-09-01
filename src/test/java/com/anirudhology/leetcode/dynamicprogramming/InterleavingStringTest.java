package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InterleavingStringTest {

    private final InterleavingString interleavingString = new InterleavingString();

    @Test
    void testInterleavingString() {
        // Test cases
        assertTrue(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertFalse(interleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        assertTrue(interleavingString.isInterleave("", "", ""));
        assertTrue(interleavingString.isInterleave("a", "", "a"));
        assertTrue(interleavingString.isInterleave("", "b", "b"));
        assertFalse(interleavingString.isInterleave("abc", "def", "abdccfe"));
    }

    @Test
    void testEdgeCases() {
        // Test case where lengths don't match
        assertFalse(interleavingString.isInterleave("abc", "def", "abcdefg"));

        // Test case with longer strings
        assertTrue(interleavingString.isInterleave("abc", "def", "adbcef"));

        // Test with one empty string
        assertFalse(interleavingString.isInterleave("", "a", "b"));
    }
}