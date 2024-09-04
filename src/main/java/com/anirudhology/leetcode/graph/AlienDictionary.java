package com.anirudhology.leetcode.graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class AlienDictionary {

    public String foreignDictionary(String[] words) {
        // Total number of words
        int n = words.length;
        // Directed graph of character.
        final boolean[][] graph = new boolean[26][26];
        // Array to represent characters in the language
        final boolean[] characters = new boolean[26];
        // Count of unique letters in the language
        int uniqueLetterCount = 0;
        // Process every word
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (uniqueLetterCount == 26) {
                    break;
                }
                int index = word.charAt(i) - 'a';
                if (!characters[index]) {
                    characters[index] = true;
                    uniqueLetterCount++;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                // If next word is a prefix of current word, we have
                // invalid order
                if (j >= words[i + 1].length()) {
                    return "";
                }
                // Compare characters of two words
                char current = words[i].charAt(j);
                char next = words[i + 1].charAt(j);
                // If both characters are same, no information regarding their
                // order is extracted
                if (current == next) {
                    continue;
                }
                // If there is already a directed graph between next and current,
                // it means cycle exists
                if (graph[next - 'a'][current - 'a']) {
                    return "";
                }
                // Else, establish an edge between current and next
                graph[current - 'a'][next - 'a'] = true;
                break;
            }
        }
        // Now, the graph is created, we will now start the process of
        // topological sorting

        // 1. Find indegrees of every node
        final int[] indegrees = new int[26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (i != j && characters[i] && characters[j] && graph[i][j]) {
                    indegrees[j]++;
                }
            }
        }
        // 2. Queue to store nodes with zero indegrees
        final Deque<Integer> zeroIndegreeNodes = new ArrayDeque<>();
        for (int i = 0; i < 26; i++) {
            if (characters[i] && indegrees[i] == 0) {
                zeroIndegreeNodes.offer(i);
            }
        }
        // 3. Perform topological sort
        final StringBuilder order = new StringBuilder();
        while (!zeroIndegreeNodes.isEmpty()) {
            int current = zeroIndegreeNodes.remove();
            order.append((char)(current + 'a'));
            for (int i = 0; i < 26; i++) {
                if (i != current && characters[i] && graph[current][i]) {
                    indegrees[i]--;
                    if (indegrees[i] == 0) {
                        zeroIndegreeNodes.offer(i);
                    }
                }
            }
        }
        return order.length() < uniqueLetterCount ? "" : order.toString();
    }
}
