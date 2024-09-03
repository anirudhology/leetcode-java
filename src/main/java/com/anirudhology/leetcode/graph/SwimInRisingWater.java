package com.anirudhology.leetcode.graph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SwimInRisingWater {

    public int swimInWater(int[][] grid) {
        // Length of the grid
        final int n = grid.length;
        // Min heap to store all the neighbors of current cell that
        // can potentially be good candidates to move next.
        final Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        // Array to store the visited cells
        final boolean[][] visited = new boolean[n][n];
        // Four directions
        final int[][] directions = new int[][]{
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };
        // Add the first cell to the heap
        minHeap.offer(new int[]{grid[0][0], 0, 0});
        // Mark this cell visited also
        visited[0][0] = true;
        // Process until the heap is empty, or we reach the final cell
        while (!minHeap.isEmpty()) {
            // Current cell
            int[] currentCell = minHeap.remove();
            int time = currentCell[0];
            int i = currentCell[1];
            int j = currentCell[2];
            // Check if we have reached bottom-right
            if (i == n - 1 && j == n - 1) {
                return time;
            }
            // Check for all four directions
            for (int[] direction : directions) {
                int x = i + direction[0];
                int y = j + direction[1];
                // Check for out of bounds
                if (x < 0 || x >= n || y < 0 || y >= n || visited[x][y]) {
                    continue;
                }
                minHeap.offer(new int[]{Math.max(time, grid[x][y]), x, y});
                visited[x][y] = true;
            }
        }
        return -1;
    }
}
