package com.anirudhology.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        // List to store the final partitions
        final List<List<String>> partitions = new ArrayList<>();
        // Special case
        if (s == null || s.isEmpty()) {
            return partitions;
        }
        // Perform backtracking
        backtrack(s, 0, new ArrayList<>(), partitions);
        return partitions;
    }

    private void backtrack(String s, int index, List<String> current, List<List<String>> partitions) {
        if (index == s.length()) {
            partitions.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            // Check for palindrome
            if (isPalindrome(s, index, i)) {
                current.add(s.substring(index, i + 1));
                backtrack(s, i + 1, current, partitions);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
