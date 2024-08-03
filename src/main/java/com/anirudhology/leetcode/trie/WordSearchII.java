package com.anirudhology.leetcode.trie;

import com.anirudhology.leetcode.util.TrieNodeWithWord;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        // List to store final output
        final List<String> result = new ArrayList<>();
        if (board == null || board.length == 0 || words == null || words.length == 0) {
            return result;
        }
        // Build the trie
        TrieNodeWithWord root = createTrie(words);
        // Dimensions of the board
        int m = board.length;
        int n = board[0].length;
        // Process every cell using DFS
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i, j, m, n, root, result);
            }
        }
        return result;
    }

    private TrieNodeWithWord createTrie(String[] words) {
        TrieNodeWithWord root = new TrieNodeWithWord();
        for (String word : words) {
            TrieNodeWithWord current = root;
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    current.children[c - 'a'] = new TrieNodeWithWord();
                }
                current = current.children[c - 'a'];
            }
            current.word = word;
        }
        return root;
    }

    private void dfs(char[][] board, int i, int j, int m, int n, TrieNodeWithWord node, List<String> result) {
        // Check for out of bounds indices
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        // Current character
        char currentCharacter = board[i][j];
        // Check if we have already visited this cell
        if (currentCharacter == '#') {
            return;
        }
        // Check if we have children for the current node
        if (node.children[currentCharacter - 'a'] == null) {
            return;
        }
        node = node.children[currentCharacter - 'a'];
        if (node.word != null) {
            result.add(node.word);
            node.word = null; // To avoid duplicates
        }
        board[i][j] = '#';
        // Perform DFS
        dfs(board, i - 1, j, m, n, node, result);
        dfs(board, i + 1, j, m, n, node, result);
        dfs(board, i, j - 1, m, n, node, result);
        dfs(board, i, j + 1, m, n, node, result);
        board[i][j] = currentCharacter;
    }
}
