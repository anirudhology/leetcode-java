package com.anirudhology.leetcode.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        final int m = grid.length;
        final int n = grid[0].length;
        // Queue to store all the fresh oranges
        final Deque<int[]> cells = new ArrayDeque<>();
        // Total number of minutes taken
        int minutes = 0;
        // Fresh oranges
        int freshOranges = 0;
        // Four directions
        final int[][] directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        // Add all the cells with rotten oranges in the queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    cells.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        // If there are no fresh oranges, return 0
        if (freshOranges == 0) {
            return 0;
        }
        // Traverse until there is any fresh orange left
        while (!cells.isEmpty()) {
            minutes++;
            int size = cells.size();
            for (int i = 0; i < size; i++) {
                // Get the cell from the front
                int[] cell = cells.remove();
                // Check in all four directions
                for (int[] direction : directions) {
                    int x = direction[0] + cell[0];
                    int y = direction[1] + cell[1];
                    // Check for validity
                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != 1) {
                        continue;
                    }
                    cells.offer(new int[] { x, y });
                    grid[x][y] = 2;
                    freshOranges--;
                }
            }
        }
        return freshOranges == 0 ? minutes - 1 : -1;
    }
}
