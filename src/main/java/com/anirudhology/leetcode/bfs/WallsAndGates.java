package com.anirudhology.leetcode.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class WallsAndGates {

    public int[][] islandsAndTreasure(int[][] rooms) {
        // Special case
        if (rooms == null || rooms.length == 0) {
            return rooms;
        }
        // Dimensions of the grid
        final int m = rooms.length;
        final int n = rooms[0].length;
        // Queue to perform BFS
        final Deque<int[]> cells = new ArrayDeque<>();
        // Mark all gates
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rooms[i][j] == 0) {
                    cells.offer(new int[]{i, j});
                }
            }
        }
        // Distance from gates
        int distance = 0;
        // Four directions
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        // Perform BFS using queue
        while (!cells.isEmpty()) {
            distance++;
            // Process nodes at the current level
            for (int i = 0; i < cells.size(); i++) {
                // Get front of the queue
                int[] cell = cells.remove();
                // Check in four directions w.r.t. this cell
                for (int[] direction : directions) {
                    int x = cell[0] + direction[0];
                    int y = cell[1] + direction[1];
                    // Check the validity of this cell
                    if (x >= 0 && x < m && y >= 0 && y < n && rooms[x][y] == Integer.MAX_VALUE) {
                        rooms[x][y] = distance;
                        cells.offer(new int[]{x, y});
                    }
                }
            }
        }
        return rooms;
    }
}
