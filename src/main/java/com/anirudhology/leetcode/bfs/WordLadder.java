package com.anirudhology.leetcode.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Convert the List of words to Set for O(1) search
        final Set<String> words = new HashSet<>(wordList);
        // Check if end words is not present in the set
        if (!words.contains(endWord)) {
            return 0;
        }
        // From here on, we will perform BFS. First, we will search the
        // neighbors of beginWord and then their neighbors and so on
        // until we reach the endWord
        final Deque<String> nodes = new ArrayDeque<>();
        nodes.offer(beginWord);
        // Since, we start from the beginWord, the level of the ladder is 1
        int level = 1;
        // Process until the queue is empty or we reach endWord
        while (!nodes.isEmpty()) {
            // Words at the current level
            final int size = nodes.size();
            for (int i = 0; i < size; i++) {
                // Current word
                char[] currentWord = nodes.remove().toCharArray();
                // Try putting all alphabets in the word to see if the
                // endWord is present
                for (int j = 0; j < currentWord.length; j++) {
                    // Original character
                    char originalCharacter = currentWord[j];
                    // Try pull all alphabets to see if endWord is matched
                    for (char c = 'a'; c <= 'z'; c++) {
                        currentWord[j] = c;
                        // Check if the new word is present in the words list
                        if (words.contains(String.valueOf(currentWord))) {
                            // Check if this word is equal to the endWord
                            if (endWord.equals(String.valueOf(currentWord))) {
                                return level + 1;
                            }
                            // Remove it from the set as it has been considered
                            words.remove(String.valueOf(currentWord));
                            // Add it to the queue for next iteration
                            nodes.offer(String.valueOf(currentWord));
                        }
                    }
                    // Restore the original character
                    currentWord[j] = originalCharacter;
                }
            }
            level++;
        }
        return 0;
    }
}
