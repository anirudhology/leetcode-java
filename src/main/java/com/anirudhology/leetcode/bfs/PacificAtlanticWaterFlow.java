package com.anirudhology.leetcode.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PacificAtlanticWaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // List to store the valid coordinates
        final List<List<Integer>> coordinates = new ArrayList<>();
        // Special case
        if (heights == null || heights.length == 0) {
            return coordinates;
        }
        // Dimensions of the island
        final int m = heights.length;
        final int n = heights[0].length;
        // Boolean arrays to keep track of visited cells
        final boolean[][] pacificVisited = new boolean[m][n];
        final boolean[][] atlanticVisited = new boolean[m][n];
        // Queues to perform BFS for both the oceans
        final Deque<int[]> pacificCells = new ArrayDeque<>();
        final Deque<int[]> atlanticCells = new ArrayDeque<>();
        // Populate the coordinates of pacific and atlantic borders
        for (int i = 0; i < m; i++) {
            pacificCells.offer(new int[]{i, 0});
            atlanticCells.offer(new int[]{i, n - 1});
            pacificVisited[i][0] = true;
            atlanticVisited[i][n - 1] = true;
        }
        for (int j = 0; j < n; j++) {
            pacificCells.offer(new int[]{0, j});
            atlanticCells.offer(new int[]{m - 1, j});
            pacificVisited[0][j] = true;
            atlanticVisited[m - 1][j] = true;
        }
        // Perform BFS on both the queues
        bfs(heights, pacificCells, pacificVisited, m, n);
        bfs(heights, atlanticCells, atlanticVisited, m, n);
        // Combine visited cells from both oceans
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacificVisited[i][j] && atlanticVisited[i][j]) {
                    coordinates.add(List.of(i, j));
                }
            }
        }
        return coordinates;
    }

    private void bfs(int[][] heights, Deque<int[]> cells, boolean[][] visited, int m, int n) {
        // Four directions
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!cells.isEmpty()) {
            int[] cell = cells.remove();
            // Check in all four directions
            for (int[] direction : directions) {
                int x = direction[0] + cell[0];
                int y = direction[1] + cell[1];
                if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || heights[x][y] < heights[cell[0]][cell[1]]) {
                    continue;
                }
                visited[x][y] = true;
                cells.offer(new int[]{x, y});
            }
        }
    }
}
