package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestIncreasingPathInAMatrixTest {

    private final LongestIncreasingPathInAMatrix longestIncreasingPathInAMatrix = new LongestIncreasingPathInAMatrix();

    @Test
    void testLongestIncreasingPath() {
        // Test case 1: Single element matrix
        int[][] matrix1 = {{5}};
        assertEquals(1, longestIncreasingPathInAMatrix.longestIncreasingPath(matrix1));

        // Test case 2: 2x2 matrix with no increasing path
        int[][] matrix2 = {{3, 2}, {1, 0}};
        assertEquals(3, longestIncreasingPathInAMatrix.longestIncreasingPath(matrix2));

        // Test case 3: 2x2 matrix with a simple increasing path
        int[][] matrix3 = {{1, 2}, {3, 4}};
        assertEquals(3, longestIncreasingPathInAMatrix.longestIncreasingPath(matrix3));

        // Test case 4: 3x3 matrix with a more complex path
        int[][] matrix4 = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };
        assertEquals(4, longestIncreasingPathInAMatrix.longestIncreasingPath(matrix4));

        // Test case 5: 3x3 matrix with all elements the same
        int[][] matrix5 = {
                {7, 7, 7},
                {7, 7, 7},
                {7, 7, 7}
        };
        assertEquals(1, longestIncreasingPathInAMatrix.longestIncreasingPath(matrix5));

        // Test case 6: 4x4 matrix with multiple increasing paths
        int[][] matrix6 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {6, 5, 4, 3},
                {7, 8, 9, 10}
        };
        assertEquals(9, longestIncreasingPathInAMatrix.longestIncreasingPath(matrix6));
    }
}