package com.anirudhology.leetcode.unionfind;

public class NumberOfConnectedComponentsInAnUndirectedGraph {

    public int countComponents(int n, int[][] edges) {
        // Array to store parent of each node
        final int[] parents = new int[n];
        // In the beginning, every node is a parent of itself
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
        // For each edge perform union of two vertices
        for (int[] edge : edges) {
            union(edge[0], edge[1], parents);
        }
        // Count the number of connected components by counting the
        // nodes that are their own parents
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == find(i, parents)) {
                count++;
            }
        }
        return count;
    }

    private void union(int a, int b, int[] parents) {
        // Get root parent of both nodes
        int rootA = find(a, parents);
        int rootB = find(b, parents);
        parents[rootA] = rootB;
    }

    private int find(int node, int[] parents) {
        if (parents[node] != node) {
            // Path compression
            parents[node] = parents[parents[node]];
        }
        return parents[node]; // Root parent of the node
    }
}
