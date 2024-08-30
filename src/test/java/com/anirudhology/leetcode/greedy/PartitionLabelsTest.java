package com.anirudhology.leetcode.greedy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitionLabelsTest {

    private final PartitionLabels partitionLabels = new PartitionLabels();

    @Test
    public void testPartitionLabels() {
        // Test null input
        assertEquals(List.of(), partitionLabels.partitionLabels(null));

        // Test empty string
        assertEquals(List.of(), partitionLabels.partitionLabels(""));

        // Test string with all unique characters
        assertEquals(Arrays.asList(1, 1, 1, 1), partitionLabels.partitionLabels("abcd"));

        // Test string with all same characters
        assertEquals(List.of(4), partitionLabels.partitionLabels("aaaa"));

        // Test string with multiple partitions
        assertEquals(Arrays.asList(9, 7, 8), partitionLabels.partitionLabels("ababcbacadefegdehijhklij"));

        // Test string with overlapping partitions
        assertEquals(Arrays.asList(1, 9), partitionLabels.partitionLabels("eababcbaca"));
    }

    @Test
    public void testEdgeCases() {
        // Test single character string
        assertEquals(List.of(1), partitionLabels.partitionLabels("a"));

        // Test string with repeating characters
        assertEquals(List.of(7), partitionLabels.partitionLabels("abacaba"));
    }
}