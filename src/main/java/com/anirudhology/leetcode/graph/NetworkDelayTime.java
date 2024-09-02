package com.anirudhology.leetcode.graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class NetworkDelayTime {

    public int networkDelayTime(int[][] times, int n, int k) {
        // First we need to create a graph
        final Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for (int[] time : times) {
            graph.putIfAbsent(time[0], new HashMap<>());
            graph.get(time[0]).put(time[1], time[2]);
        }
        // Heap to store pair of distance and node
        final Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        // Distance of self loop is 0
        minHeap.offer(new int[]{0, k});
        // Array to store visited nodes
        final boolean[] visited = new boolean[n + 1];
        int delay = 0;
        // Perform BFS on the nodes
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.remove();
            int currentDistance = current[0];
            int currentNode = current[1];
            // If we have already visited this node
            if (visited[currentNode]) {
                continue;
            }
            visited[currentNode] = true;
            delay = currentDistance;
            n--;
            // Update the distance to neighboring nodes
            if (graph.containsKey(currentNode)) {
                for (int neighbor : graph.get(currentNode).keySet()) {
                    minHeap.offer(new int[]{currentDistance + graph.get(currentNode).get(neighbor), neighbor});
                }
            }
        }
        return n == 0 ? delay : -1;
    }
}
