package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostToConnectAllPointsTest {

    private final MinCostToConnectAllPoints minCostToConnectAllPoints = new MinCostToConnectAllPoints();

    @Test
    public void testMinCostConnectPoints_emptyInput() {
        int[][] points = {};
        assertEquals(0, minCostToConnectAllPoints.minCostConnectPoints(points));
    }

    @Test
    public void testMinCostConnectPoints_singlePoint() {
        int[][] points = {{0, 0}};
        assertEquals(0, minCostToConnectAllPoints.minCostConnectPoints(points));
    }

    @Test
    public void testMinCostConnectPoints_twoPoints() {
        int[][] points = {{0, 0}, {1, 1}};
        assertEquals(2, minCostToConnectAllPoints.minCostConnectPoints(points)); // Manhattan distance (1,1) - (0,0) = 1 + 1 = 2
    }

    @Test
    public void testMinCostConnectPoints_multiplePoints() {
        int[][] points = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        assertEquals(20, minCostToConnectAllPoints.minCostConnectPoints(points));
    }

    @Test
    public void testMinCostConnectPoints_negativePoints() {
        int[][] points = {{-1, -2}, {1, 3}, {4, 5}};
        assertEquals(12, minCostToConnectAllPoints.minCostConnectPoints(points)); // 4+5 (first connection) + 3+0 (second connection)
    }
}