package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordBreakTest {

    private final WordBreak wordBreak = new WordBreak();

    @Test
    public void testWordBreak() {
        // Test case for null input string
        assertFalse(wordBreak.wordBreak(null, List.of("leet", "code")));

        // Test case for empty string
        assertFalse(wordBreak.wordBreak("", List.of("leet", "code")));

        // Test case for null wordDict
        assertFalse(wordBreak.wordBreak("leetcode", null));

        // Test case for empty wordDict
        assertFalse(wordBreak.wordBreak("leetcode", List.of()));

        // Test case for string that can be segmented
        assertTrue(wordBreak.wordBreak("leetcode", List.of("leet", "code")));

        // Test case for string that cannot be segmented
        assertFalse(wordBreak.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));

        // Test case for string with overlapping words
        assertTrue(wordBreak.wordBreak("applepenapple", List.of("apple", "pen")));

        // Test case for string with single character words
        assertTrue(wordBreak.wordBreak("abcd", List.of("a", "b", "c", "d")));
    }
}