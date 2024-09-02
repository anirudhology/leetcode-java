package com.anirudhology.leetcode.graph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinCostToConnectAllPoints {

    public int minCostConnectPoints(int[][] points) {
        // Special case
        if (points == null || points.length == 0) {
            return 0;
        }
        // Total number of points
        final int n = points.length;
        // Array to store visited vertices
        final boolean[] visited = new boolean[n];
        // We need to visit only n - 1 vertices as we don't want
        // cycle in the graph
        int edgesLeftToVisit = n - 1;
        // Total cost of connecting points
        int cost = 0;
        // Since we always want nearest edge to be chosen first,
        // we will use minHeap to store edges by distances
        final Queue<Edge> edges = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        // We will choose first vertex 0 to find cost to reach all
        // points from here
        for (int i = 1; i < n; i++) {
            int currentCost = Math.abs(points[i][0] - points[0][0]) + Math.abs(points[i][1] - points[0][1]);
            edges.offer(new Edge(0, i, currentCost));
        }
        // Mark 0 node as visited
        visited[0] = true;
        // Process edges until edgesLeftToVisit becomes 0
        while (!edges.isEmpty() && edgesLeftToVisit > 0) {
            // Get the current edge
            Edge edge = edges.remove();
            int v = edge.v;
            int weight = edge.weight;
            if (!visited[v]) {
                // Add the cost and mark as visited
                cost += weight;
                visited[v] = true;
                // Now traverse all possible points from v
                for (int i = 0; i < n; i++) {
                    if (!visited[i]) {
                        int distance = Math.abs(points[v][0] - points[i][0]) + Math.abs(points[v][1] - points[i][1]);
                        edges.offer(new Edge(v, i, distance));
                    }
                }
                edgesLeftToVisit--;
            }
        }
        return cost;
    }

    static class Edge {
        int u;
        int v;
        int weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }
}
