package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    @Test
    public void testLCS_SimpleCase() {
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void testLCS_NoCommonSubsequence() {
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence("abc", "def"));
    }

    @Test
    public void testLCS_EmptyStrings() {
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence("", ""));
    }

    @Test
    public void testLCS_OneEmptyString() {
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence("abcde", ""));
    }

    @Test
    public void testLCS_FullMatch() {
        assertEquals(5, longestCommonSubsequence.longestCommonSubsequence("abcde", "abcde"));
    }

    @Test
    public void testLCS_ReversedStrings() {
        assertEquals(1, longestCommonSubsequence.longestCommonSubsequence("abcde", "edcba"));
    }
}