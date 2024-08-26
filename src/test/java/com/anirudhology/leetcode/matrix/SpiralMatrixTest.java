package com.anirudhology.leetcode.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrixTest {

    private final SpiralMatrix spiralMatrix = new SpiralMatrix();

    @Test
    public void testSpiralOrder_EmptyMatrix() {
        int[][] matrix = {};
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, spiralMatrix.spiralOrder(matrix));
    }

    @Test
    public void testSpiralOrder_SingleElement() {
        int[][] matrix = {{1}};
        List<Integer> expected = List.of(1);
        assertEquals(expected, spiralMatrix.spiralOrder(matrix));
    }

    @Test
    public void testSpiralOrder_SingleRow() {
        int[][] matrix = {{1, 2, 3, 4}};
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, spiralMatrix.spiralOrder(matrix));
    }

    @Test
    public void testSpiralOrder_SingleColumn() {
        int[][] matrix = {{1}, {2}, {3}, {4}};
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, spiralMatrix.spiralOrder(matrix));
    }

    @Test
    public void testSpiralOrder_RectangularMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected, spiralMatrix.spiralOrder(matrix));
    }

    @Test
    public void testSpiralOrder_RectangularMatrix_2x3() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> expected = List.of(1, 2, 3, 6, 5, 4);
        assertEquals(expected, spiralMatrix.spiralOrder(matrix));
    }
}