package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromePartitioningTest {

    private final PalindromePartitioning palindromePartitioning = new PalindromePartitioning();

    @Test
    public void testPartition() {
        List<List<String>> result1 = palindromePartitioning.partition("aab");
        List<List<String>> expected1 = new ArrayList<>();
        expected1.add(List.of("a", "a", "b"));
        expected1.add(List.of("aa", "b"));
        assertEquals(expected1, result1);

        List<List<String>> result2 = palindromePartitioning.partition("a");
        List<List<String>> expected2 = new ArrayList<>();
        expected2.add(List.of("a"));
        assertEquals(expected2, result2);

        List<List<String>> result3 = palindromePartitioning.partition("");
        List<List<String>> expected3 = new ArrayList<>();
        assertEquals(expected3, result3);

        List<List<String>> result4 = palindromePartitioning.partition("aba");
        List<List<String>> expected4 = new ArrayList<>();
        expected4.add(List.of("a", "b", "a"));
        expected4.add(List.of("aba"));
        assertEquals(expected4, result4);
    }
}