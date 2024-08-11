package com.anirudhology.leetcode.dfs;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        final int m = grid.length;
        final int n = grid[0].length;
        // Boolean array to mark the visited cells
        boolean[][] visited = new boolean[m][n];
        // Variable to keep track of maximum area
        int maxArea = 0;
        // Process each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int currentArea = dfs(grid, i, j, m, n, visited);
                    // Update maxArea, if required
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        // Base case
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
            return 0;
        }
        // Mark the current cell as visited
        visited[i][j] = true;
        if (grid[i][j] == 0) {
            return 0;
        }
        // Perform DFS and add 1s encountered
        return 1 + dfs(grid, i - 1, j, m, n, visited)
                + dfs(grid, i + 1, j, m, n, visited)
                + dfs(grid, i, j - 1, m, n, visited)
                + dfs(grid, i, j + 1, m, n, visited);
    }
}
