package com.anirudhology.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // List to store the result
        List<List<String>> groups = new ArrayList<>();
        // Special case
        if (strs == null || strs.length == 0) {
            return groups;
        }
        // Map to store anagrams together with their frequency representation
        Map<String, List<String>> mappings = new HashMap<>();
        // Process each string one by one
        for (String s : strs) {
            // Create a frequency map for the current string
            int[] frequency = new int[26];
            for (char c : s.toCharArray()) {
                frequency[c - 'a']++;
            }
            String key = Arrays.toString(frequency);
            if (!mappings.containsKey(key)) {
                mappings.put(key, new ArrayList<>());
            }
            mappings.get(key).add(s);
        }
        // Get all the groups and add them together
        groups.addAll(mappings.values());
        return groups;
    }
}
