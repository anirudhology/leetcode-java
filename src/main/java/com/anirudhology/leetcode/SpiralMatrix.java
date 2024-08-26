package com.anirudhology.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        // List to store the final output
        final List<Integer> spiral = new ArrayList<>();
        // Special case
        if (matrix == null || matrix.length == 0) {
            return spiral;
        }
        // Dimensions of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        // Variables to keep track of top, bottom, left and right
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        // Process all elements from the left
        while (left <= right && top <= bottom) {
            // Move from left to right
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;
            // Move from top to bottom
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;
            // Check if we have reached out of bounds
            if (left > right || top > bottom) {
                break;
            }
            // Move from right to left
            for (int i = right; i >= left; i--) {
                spiral.add(matrix[bottom][i]);
            }
            bottom--;
            // Move from bottom to top
            for (int i = bottom; i >= top; i--) {
                spiral.add(matrix[i][left]);
            }
            left++;
        }
        return spiral;
    }
}
