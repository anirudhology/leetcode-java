package com.anirudhology.leetcode.graph;

import com.anirudhology.leetcode.util.GraphNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CloneGraphTest {

    private final CloneGraph cloneGraph = new CloneGraph();

    @Test
    public void testNullNode() {
        assertNull(cloneGraph.cloneGraph(null));
    }

    @Test
    public void testSingleNode() {
        GraphNode node = new GraphNode(1);
        GraphNode clone = cloneGraph.cloneGraph(node);
        assertNotSame(node, clone);
        assertEquals(node.val, clone.val);
        assertTrue(clone.neighbors.isEmpty());
    }

    @Test
    public void testGraphWithOneEdge() {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        GraphNode clone = cloneGraph.cloneGraph(node1);

        assertNotSame(node1, clone);
        assertEquals(node1.val, clone.val);
        assertEquals(1, clone.neighbors.size());
        assertEquals(2, clone.neighbors.get(0).val);
        assertNotSame(node1.neighbors.get(0), clone.neighbors.get(0));
    }

    @Test
    public void testGraphWithCycle() {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        node1.neighbors.add(node2);
        node2.neighbors.add(node3);
        node3.neighbors.add(node1);

        GraphNode clone = cloneGraph.cloneGraph(node1);

        assertNotSame(node1, clone);
        assertEquals(node1.val, clone.val);
        assertEquals(1, clone.neighbors.size());
        assertEquals(2, clone.neighbors.get(0).val);

        GraphNode clone2 = clone.neighbors.get(0);
        assertEquals(3, clone2.neighbors.get(0).val);
        assertEquals(1, clone2.neighbors.get(0).neighbors.get(0).val);
    }
}