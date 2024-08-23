package com.anirudhology.leetcode.unionfind;

public class RedundantConnection {

    public int[] findRedundantConnection(int[][] edges) {
        // Total number of nodes
        final int n = edges.length;
        // Parent and rank array
        final int[] parents = new int[n + 1];
        final int[] ranks = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            // Every node is its parent in the beginning
            parents[i] = i;
            // Every node will have rank = 1
            ranks[i] = 1;
        }
        // Check for all the edges and check if we have found a cycle
        for (int[] edge : edges) {
            if (!union(edge[0], edge[1], parents, ranks)) {
                return edge;
            }
        }
        return new int[0];
    }

    private int find(int node, int[] parents) {
        // Find parent of the current node
        int p = parents[node];
        while (parents[p] != p) {
            // Path compression
            parents[p] = parents[parents[p]];
            p = parents[p];
        }
        return p;
    }

    private boolean union(int node1, int node2, int[] parents, int[] ranks) {
        // Find the parents of both nodes
        int p1 =    find(node1, parents);
        int p2 = find(node2, parents);
        // If parents of both nodes are same, it means
        // we can't union them without creating a cycle
        if (p1 == p2) {
            return false;
        }
        // Merge both nodes
        if (ranks[p1] > ranks[p2]) {
            parents[p2] = p1;
            ranks[p1] += ranks[p2];
        } else {
            parents[p1] = p2;
            ranks[p2] += ranks[p1];
        }
        return true;
    }
}
