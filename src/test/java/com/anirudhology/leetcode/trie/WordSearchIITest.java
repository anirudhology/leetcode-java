package com.anirudhology.leetcode.trie;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordSearchIITest {

    private final WordSearchII wordSearchII = new WordSearchII();

    @Test
    public void testFindWords() {
        // Test case 1: Standard test case
        char[][] board1 = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words1 = {"oath", "pea", "eat", "rain"};
        List<String> result1 = wordSearchII.findWords(board1, words1);
        assertTrue(result1.contains("oath"));
        assertTrue(result1.contains("eat"));
        assertFalse(result1.contains("pea"));
        assertFalse(result1.contains("rain"));

        // Test case 2: Edge case with single character
        char[][] board2 = {
                {'a'}
        };
        String[] words2 = {"a"};
        List<String> result2 = wordSearchII.findWords(board2, words2);
        assertTrue(result2.contains("a"));

        // Test case 3: Empty board
        char[][] board3 = {};
        String[] words3 = {"a"};
        List<String> result3 = wordSearchII.findWords(board3, words3);
        assertTrue(result3.isEmpty());

        // Test case 4: Empty words array
        char[][] board4 = {
                {'a'}
        };
        String[] words4 = {};
        List<String> result4 = wordSearchII.findWords(board4, words4);
        assertTrue(result4.isEmpty());

        // Test case 5: No matching words
        char[][] board5 = {
                {'a', 'b'},
                {'c', 'd'}
        };
        String[] words5 = {"efgh"};
        List<String> result5 = wordSearchII.findWords(board5, words5);
        assertTrue(result5.isEmpty());
    }
}