package com.anirudhology.leetcode.graph;

import com.anirudhology.leetcode.util.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) {
            return null;
        }
        // Map to keep track of original and clone nodes
        final Map<GraphNode, GraphNode> mappings = new HashMap<>();
        // Perform DFS for this graph
        return dfs(node, mappings);
    }

    private GraphNode dfs(GraphNode node, Map<GraphNode, GraphNode> mappings) {
        // Create clone for the current node
        GraphNode cloneNode = new GraphNode(node.val);
        // Add the mapping to the mappings map
        mappings.put(node, cloneNode);
        // List to store cloned neighbors
        final List<GraphNode> cloneNeighbors = new ArrayList<>();
        // Traverse through the adjacency list
        for (GraphNode neighbor : node.neighbors) {
            // If we have already visited this node
            if (mappings.containsKey(neighbor)) {
                cloneNeighbors.add(mappings.get(neighbor));
            }
            // Perform DFS on this neighbor
            else {
                cloneNeighbors.add(dfs(neighbor, mappings));
            }
        }
        // Link neighbors
        cloneNode.neighbors = cloneNeighbors;
        return cloneNode;
    }
}
