package com.anirudhology.leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CheapestFlightsWithinKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Map to store the adjacency list
        final List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] flight : flights) {
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }
        // Queue to perform BFS
        final Queue<int[]> nodes = new LinkedList<>();
        // Add src node to the queue
        nodes.offer(new int[]{src, 0});
        // Stops taken
        int stops = 0;
        // Minimum cost
        int[] minCost = new int[n];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        // Loop until queue is not empty and number of stops are
        // less than k
        while (!nodes.isEmpty() && stops <= k) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                int[] current = nodes.remove();
                // Process then neighbors of the current node
                for (int[] neighbor : graph.get(current[0])) {
                    int node = neighbor[0];
                    int cost = neighbor[1];
                    if (cost + current[1] >= minCost[node]) {
                        continue;
                    }
                    minCost[node] = cost + current[1];
                    nodes.offer(new int[]{node, minCost[node]});
                }
            }
            stops++;
        }
        return minCost[dst] == Integer.MAX_VALUE ? -1 : minCost[dst];
    }
}
