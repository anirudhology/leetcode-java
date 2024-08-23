package com.anirudhology.leetcode.unionfind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RedundantConnectionTest {

    private final RedundantConnection redundantConnection = new RedundantConnection();

    @Test
    void testFindRedundantConnection() {
        // Test case 1: Basic cycle detection
        int[][] edges1 = {{1, 2}, {1, 3}, {2, 3}};
        assertArrayEquals(new int[]{2, 3},redundantConnection.findRedundantConnection(edges1));

        // Test case 2: Larger cycle detection
        int[][] edges2 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        assertArrayEquals(new int[]{1, 5},redundantConnection.findRedundantConnection(edges2));
    }
}