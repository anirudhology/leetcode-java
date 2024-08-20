package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphValidTreeTest {

    private final GraphValidTree graphValidTree = new GraphValidTree();

    @Test
    public void testValidTree_SingleNode() {
        assertTrue(graphValidTree.validTree(1, new int[][]{}));
    }

    @Test
    public void testValidTree_TreeStructure() {
        assertTrue(graphValidTree.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
    }

    @Test
    public void testValidTree_CycleExists() {
        assertFalse(graphValidTree.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}));
    }

    @Test
    public void testValidTree_DisconnectedGraph() {
        assertFalse(graphValidTree.validTree(4, new int[][]{{0, 1}, {2, 3}}));
    }

    @Test
    public void testValidTree_NoEdgesMultipleNodes() {
        assertFalse(graphValidTree.validTree(4, new int[][]{}));
    }
}