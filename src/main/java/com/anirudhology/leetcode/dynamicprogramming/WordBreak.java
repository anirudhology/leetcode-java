package com.anirudhology.leetcode.dynamicprogramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        // Special case
        if (s == null || s.isEmpty() || wordDict == null || wordDict.isEmpty()) {
            return false;
        }
        // Length of the string
        final int n = s.length();
        // Add all words to set so that we can get O(1) search time
        final Set<String> words = new HashSet<>(wordDict);
        // Lookup table to store if words until current index exist in
        // the dictionary or not
        final boolean[] lookup = new boolean[n + 1];
        // Empty string always exists
        lookup[0] = true;
        // Process the array
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (lookup[j] && words.contains(s.substring(j, i))) {
                    lookup[i] = true;
                    break;
                }
            }
        }
        return lookup[n];
    }
}
