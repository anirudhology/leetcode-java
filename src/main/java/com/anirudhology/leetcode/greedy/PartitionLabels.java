package com.anirudhology.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        // List to store the sizes of the partitions
        final List<Integer> sizes = new ArrayList<>();
        // Special case
        if (s == null || s.isEmpty()) {
            return sizes;
        }
        // Array to store the last index of a character
        int[] lastPosition = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastPosition[s.charAt(i) - 'a'] = i;
        }
        // Pointers for sliding window
        int left = 0;
        int right = 0;
        // Traverse the string again
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(right, lastPosition[s.charAt(i) - 'a']);
            if (right == i) {
                sizes.add(right - left + 1);
                left = i + 1;
            }
        }
        return sizes;
    }
}
