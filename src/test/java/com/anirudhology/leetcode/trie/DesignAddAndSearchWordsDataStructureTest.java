package com.anirudhology.leetcode.trie;

import org.junit.jupiter.api.Test;

import static com.anirudhology.leetcode.trie.DesignAddAndSearchWordsDataStructure.WordDictionary;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DesignAddAndSearchWordsDataStructureTest {

    @Test
     void testAddWordAndSearch() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test adding and searching for a word
        wordDictionary.addWord("apple");
        assertTrue(wordDictionary.search("apple"), "Search for 'apple' should return true");
        assertFalse(wordDictionary.search("app"), "Search for 'app' should return false");
        assertTrue(wordDictionary.search("ap.le"), "Search for 'ap.le' should return true");
        assertTrue(wordDictionary.search("a.ple"), "Search for 'a.ple' should return false");
    }

    @Test
    void testAddWordWithPrefix() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test adding words with common prefixes
        wordDictionary.addWord("car");
        wordDictionary.addWord("card");
        assertTrue(wordDictionary.search("car"), "Search for 'car' should return true");
        assertTrue(wordDictionary.search("card"), "Search for 'card' should return true");
        assertFalse(wordDictionary.search("ca"), "Search for 'ca' should return false");
        assertTrue(wordDictionary.search("c.r"), "Search for 'c.r' should return true");
    }

    @Test
    void testSearchWithWildcard() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test searching with wildcard
        wordDictionary.addWord("bat");
        wordDictionary.addWord("ball");
        assertTrue(wordDictionary.search("b.t"), "Search for 'b.t' should return true");
        assertTrue(wordDictionary.search("ba.l"), "Search for 'ba.l' should return true");
        assertTrue(wordDictionary.search("b..l"), "Search for 'b..l' should return true");
        assertFalse(wordDictionary.search("b..m"), "Search for 'b..m' should return false");
    }

    @Test
    void testAddDuplicateWord() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test adding duplicate words
        wordDictionary.addWord("dog");
        wordDictionary.addWord("dog");
        assertTrue(wordDictionary.search("dog"), "Search for 'dog' should return true after adding duplicate words");
    }

    @Test
    void testAddEmptyWord() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test adding and searching for an empty word
        wordDictionary.addWord("");
        assertTrue(wordDictionary.search(""), "Search for empty string should return true after adding empty string");
        assertFalse(wordDictionary.search("."), "Search for '.' should return false");
    }

    @Test
    void testSearchEmptyTrie() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test searching in an empty trie
        assertFalse(wordDictionary.search("anything"), "Search in empty trie should return false");
    }

    @Test
    void testSearchWithWildcardOnly() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test searching with only wildcard characters
        wordDictionary.addWord("cat");
        assertTrue(wordDictionary.search("..."), "Search for '...' should return true");
        assertFalse(wordDictionary.search(".."), "Search for '..' should return false");
    }

    @Test
    void testAddWordWithAllCharacters() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test adding words with all characters from 'a' to 'z'
        String allChars = "abcdefghijklmnopqrstuvwxyz";
        wordDictionary.addWord(allChars);
        assertTrue(wordDictionary.search(allChars), "Search for all characters should return true");
        assertFalse(wordDictionary.search(allChars + "a"), "Search for all characters plus one should return false");
    }
}