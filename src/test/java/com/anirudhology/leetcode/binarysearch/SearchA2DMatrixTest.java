package com.anirudhology.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchA2DMatrixTest {

    private final SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();

    @Test
    public void testSearchMatrixNullMatrix() {
        assertFalse(searchA2DMatrix.searchMatrix(null, 5));
    }

    @Test
    public void testSearchMatrixEmptyMatrix() {
        assertFalse(searchA2DMatrix.searchMatrix(new int[][]{}, 5));
    }

    @Test
    public void testSearchMatrixSingleElementMatrixFound() {
        assertTrue(searchA2DMatrix.searchMatrix(new int[][]{{5}}, 5));
    }

    @Test
    public void testSearchMatrixSingleElementMatrixNotFound() {
        assertFalse(searchA2DMatrix.searchMatrix(new int[][]{{5}}, 3));
    }

    @Test
    public void testSearchMatrixMultipleRowsFound() {
        assertTrue(searchA2DMatrix.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 3));
        assertTrue(searchA2DMatrix.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 11));
        assertTrue(searchA2DMatrix.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 60));
    }

    @Test
    public void testSearchMatrixMultipleRowsNotFound() {
        assertFalse(searchA2DMatrix.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 0));
        assertFalse(searchA2DMatrix.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 6));
        assertFalse(searchA2DMatrix.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 61));
    }

    @Test
    public void testSearchMatrixWithVariousScenarios() {
        // Matrix with one row
        assertTrue(searchA2DMatrix.searchMatrix(new int[][]{{1, 2, 3, 4, 5}}, 3));
        assertFalse(searchA2DMatrix.searchMatrix(new int[][]{{1, 2, 3, 4, 5}}, 6));

        // Matrix with one column
        assertTrue(searchA2DMatrix.searchMatrix(new int[][]{{1}, {2}, {3}, {4}, {5}}, 3));
        assertFalse(searchA2DMatrix.searchMatrix(new int[][]{{1}, {2}, {3}, {4}, {5}}, 6));
    }
}