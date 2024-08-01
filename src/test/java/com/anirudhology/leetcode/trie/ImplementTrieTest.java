package com.anirudhology.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplementTrieTest {

    @Test
    public void testInsertAndSearch() {
        ImplementTrie.Trie trie = new ImplementTrie.Trie();

        // Test inserting and searching single word
        trie.insert("apple");
        assertTrue(trie.search("apple"));   // should return true
        assertFalse(trie.search("app"));    // should return false
        assertTrue(trie.startsWith("app")); // should return true

        // Test inserting word which is a prefix of another word
        trie.insert("app");
        assertTrue(trie.search("app"));     // should return true
    }

    @Test
    public void testStartsWith() {
        ImplementTrie.Trie trie = new ImplementTrie.Trie();

        // Test startsWith for different prefixes
        trie.insert("banana");
        assertTrue(trie.startsWith("ban"));   // should return true
        assertTrue(trie.startsWith("bana"));  // should return true
        assertFalse(trie.startsWith("bananaa")); // should return false

        // Test startsWith for non-existing prefix
        assertFalse(trie.startsWith("xyz"));  // should return false
    }

    @Test
    public void testInsertDuplicateWords() {
        ImplementTrie.Trie trie = new ImplementTrie.Trie();

        // Test inserting the same word multiple times
        trie.insert("car");
        trie.insert("car");
        trie.insert("car");
        assertTrue(trie.search("car"));       // should return true

        // Test startsWith after inserting duplicates
        assertTrue(trie.startsWith("ca"));    // should return true
    }

    @Test
    public void testEmptyString() {
        ImplementTrie.Trie trie = new ImplementTrie.Trie();

        // Test inserting and searching empty string
        trie.insert("");
        assertTrue(trie.search(""));          // should return true
        assertTrue(trie.startsWith(""));      // should return true
    }
}