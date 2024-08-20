package com.anirudhology.leetcode.unionfind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfConnectedComponentsInAnUndirectedGraphTest {

    private final NumberOfConnectedComponentsInAnUndirectedGraph numberOfConnectedComponentsInAnUndirectedGraph
            = new NumberOfConnectedComponentsInAnUndirectedGraph();

    @Test
    public void testNoEdges() {
        int[][] edges = {};
        assertEquals(4, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(4, edges));
    }

    @Test
    public void testFullyConnectedGraph() {
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}};
        assertEquals(1, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(4, edges));
    }

    @Test
    public void testMultipleComponents() {
        int[][] edges = {{0, 1}, {2, 3}};
        assertEquals(2, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(4, edges));
    }

    @Test
    public void testSingleNode() {
        int[][] edges = {};
        assertEquals(1, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(1, edges));
    }

    @Test
    public void testEmptyGraph() {
        int[][] edges = {};
        assertEquals(0, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(0, edges));
    }
}