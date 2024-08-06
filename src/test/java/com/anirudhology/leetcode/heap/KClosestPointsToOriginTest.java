package com.anirudhology.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KClosestPointsToOriginTest {

    private final KClosestPointsToOrigin kClosestPointsToOrigin = new KClosestPointsToOrigin();

    @Test
    public void testKClosest() {
        assertArrayEquals(new int[][]{{-2, 2}}, kClosestPointsToOrigin.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
        assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, kClosestPointsToOrigin.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
        assertArrayEquals(new int[][]{{0, 1}}, kClosestPointsToOrigin.kClosest(new int[][]{{0, 1}, {1, 0}}, 1));
        assertArrayEquals(new int[][]{{1, 1}}, kClosestPointsToOrigin.kClosest(new int[][]{{1, 1}}, 1));
        assertArrayEquals(new int[][]{}, kClosestPointsToOrigin.kClosest(new int[][]{}, 0));
    }
}