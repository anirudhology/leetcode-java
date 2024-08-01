package com.anirudhology.leetcode.trie;

import com.anirudhology.leetcode.util.TrieNode;

public class ImplementTrie {

    static class Trie {

        // Root of the trie
        private final TrieNode root;

        public Trie() {
            this.root = new TrieNode('\u0000');
        }

        public void insert(String word) {
            // Check if word is already present
            if(search(word)) {
                return;
            }
            TrieNode current = root;
            // Traverse through the word
            for (char c : word.toCharArray()) {
                // Get child node corresponding to character c
                if (current.children[c - 'a'] == null) {
                    TrieNode node = new TrieNode(c);
                    current.children[c - 'a'] = node;
                }
                current = current.children[c - 'a'];
            }
            current.isWord = true;
        }

        public boolean search(String word) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    return false;
                }
                current = current.children[c - 'a'];
            }
            return current.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode current = root;
            for (char c : prefix.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    return false;
                }
                current = current.children[c - 'a'];
            }
            return true;
        }
    }
}
