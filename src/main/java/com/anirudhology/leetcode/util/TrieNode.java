package com.anirudhology.leetcode.util;

public class TrieNode {
    public final char content;
    public final TrieNode[] children;
    public boolean isWord;

    public TrieNode(char content) {
        this.children = new TrieNode[26];
        this.content = content;
    }
}
