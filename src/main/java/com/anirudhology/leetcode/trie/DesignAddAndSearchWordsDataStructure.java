package com.anirudhology.leetcode.trie;

import com.anirudhology.leetcode.util.TrieNode;

public class DesignAddAndSearchWordsDataStructure {

    static class WordDictionary {

        private final TrieNode root;

        public WordDictionary() {
            this.root = new TrieNode('\u0000');
        }

        public void addWord(String word) {
            // Check if word is already present in the dictionary
            if (search(word)) {
                return;
            }
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    current.children[c - 'a'] = new TrieNode(c);
                }
                current = current.children[c - 'a'];
            }
            current.isWord = true;
        }

        public boolean search(String word) {
            return searchHelper(word.toCharArray(), 0, root);
        }

        private boolean searchHelper(char[] chars, int index, TrieNode node) {
            if (index == chars.length) {
                return node.isWord;
            }
            if (chars[index] == '.') {
                for (TrieNode child : node.children) {
                    if (child != null && searchHelper(chars, index + 1, child)) {
                        return true;
                    }
                }
            } else {
                return node.children[chars[index] - 'a'] != null && searchHelper(chars, index + 1, node.children[chars[index] - 'a']);
            }
            return false;
        }
    }
}
