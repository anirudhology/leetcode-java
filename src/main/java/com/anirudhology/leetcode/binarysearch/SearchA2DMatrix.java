package com.anirudhology.leetcode.binarysearch;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int n = matrix[0].length;
        // Process matrix row by row
        for (int[] row : matrix) {
            if (row[0] <= target && row[n - 1] >= target) {
                return doesElementExist(row, n, target);
            }
        }
        return false;
    }

    private boolean doesElementExist(int[] row, int n, int target) {
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Process the row from both ends
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (row[middle] == target) {
                return true;
            } else if (row[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}
