package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegularExpressionMatchingTest {

    private final RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();

    @Test
    public void testIsMatch() {
        assertTrue(regularExpressionMatching.isMatch("aa", "a*"));
        assertTrue(regularExpressionMatching.isMatch("ab", ".*"));
        assertFalse(regularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
        assertTrue(regularExpressionMatching.isMatch("aab", "c*a*b"));
        assertFalse(regularExpressionMatching.isMatch("ab", "a"));
        assertTrue(regularExpressionMatching.isMatch("", ".*"));
        assertTrue(regularExpressionMatching.isMatch("", "a*"));
        assertFalse(regularExpressionMatching.isMatch("abcd", "d*"));
        assertTrue(regularExpressionMatching.isMatch("aaa", "a*a"));
        assertFalse(regularExpressionMatching.isMatch("aaa", "ab*a"));
    }
}