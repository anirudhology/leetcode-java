package com.anirudhology.leetcode.math;

public class RotateImage {

    public void rotate(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return;
        }
        // Order of the matrix
        final int n = matrix.length;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        while (left < right) {
            // Swap the elements at left and right
            int[] temp = matrix[right];
            matrix[right] = matrix[left];
            matrix[left] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
