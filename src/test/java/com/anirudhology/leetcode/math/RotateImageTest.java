package com.anirudhology.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateImageTest {

    private final RotateImage rotateImage = new RotateImage();

    @Test
    public void testRotate() {
        // Test case 1: 3x3 matrix
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected1 = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        rotateImage.rotate(matrix1);
        assertArrayEquals(expected1, matrix1);

        // Test case 2: 4x4 matrix
        int[][] matrix2 = {
                { 5,  1,  9, 11},
                { 2,  4,  8, 10},
                {13,  3,  6,  7},
                {15, 14, 12, 16}
        };
        int[][] expected2 = {
                {15, 13,  2,  5},
                {14,  3,  4,  1},
                {12,  6,  8,  9},
                {16,  7, 10, 11}
        };
        rotateImage.rotate(matrix2);
        assertArrayEquals(expected2, matrix2);

        // Test case 3: 1x1 matrix
        int[][] matrix3 = {{1}};
        int[][] expected3 = {{1}};
        rotateImage.rotate(matrix3);
        assertArrayEquals(expected3, matrix3);

        // Test case 4: Empty matrix
        int[][] matrix4 = {};
        int[][] expected4 = {};
        rotateImage.rotate(matrix4);
        assertArrayEquals(expected4, matrix4);

        // Test case 5: Null matrix
        rotateImage.rotate(null);
        assertArrayEquals(null, (Object[]) null);
    }
}