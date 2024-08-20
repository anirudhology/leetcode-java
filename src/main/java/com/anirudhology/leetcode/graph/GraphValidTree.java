package com.anirudhology.leetcode.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphValidTree {

    public boolean validTree(int n, int[][] edges) {
        // Adjacency list
        final List<Set<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }
        // Array to store visited nodes
        final boolean[] visited = new boolean[n];
        // Queue to perform BFS
        final Deque<Integer> nodes = new ArrayDeque<>();
        nodes.offer(0);
        while (!nodes.isEmpty()) {
            int node = nodes.remove();
            // Found loop
            if (visited[node]) {
                return false;
            }
            visited[node] = true;
            for (int neighbor : adjacencyList.get(node)) {
                nodes.offer(neighbor);
                adjacencyList.get(neighbor).remove(node);
            }
        }
        for (boolean element : visited) {
            if (!element) {
                return false;
            }
        }
        return true;
    }
}
