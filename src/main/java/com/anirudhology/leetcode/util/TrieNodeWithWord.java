package com.anirudhology.leetcode.util;

public class TrieNodeWithWord {
    public String word;
    public final TrieNodeWithWord[] children;

    public TrieNodeWithWord() {
        this.children = new TrieNodeWithWord[26];
    }
}
