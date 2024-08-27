package com.anirudhology.leetcode.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SetMatrixZeroesTest {

    private final SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();

    @Test
    public void testSetZeroes_EmptyMatrix() {
        int[][] matrix = {};
        int[][] expected = setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes_SingleElementZero() {
        int[][] matrix = {{0}};
        int[][] expected = setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes_SingleElementNonZero() {
        int[][] matrix = {{1}};
        int[][] expected = setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes_MatrixWithNoZeroes() {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] expected = setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes_MatrixWithZeroes() {
        int[][] matrix = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes_MatrixWithMultipleZeroes() {
        int[][] matrix = {{0, 2, 3}, {4, 5, 0}, {7, 8, 9}};
        int[][] expected = setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }
}