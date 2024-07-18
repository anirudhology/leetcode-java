package com.anirudhology.leetcode.binarysearch;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        // Dimensions of the matrix
        final int m = matrix.length;
        final int n = matrix[0].length;
        // Start and end pointers
        int start = 0;
        int end = m * n - 1;
        // Process the matrix
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int i = middle / n;
            int j = middle % n;
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false;
    }
}
