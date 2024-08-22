package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsTest {

    private final UniquePaths uniquePaths = new UniquePaths();

    @Test
    public void testUniquePaths_3x7() {
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
    }

    @Test
    public void testUniquePaths_1x1() {
        assertEquals(1, uniquePaths.uniquePaths(1, 1));
    }

    @Test
    public void testUniquePaths_2x2() {
        assertEquals(2, uniquePaths.uniquePaths(2, 2));
    }

    @Test
    public void testUniquePaths_3x3() {
        assertEquals(6, uniquePaths.uniquePaths(3, 3));
    }

    @Test
    public void testUniquePaths_7x3() {
        assertEquals(28, uniquePaths.uniquePaths(7, 3));
    }
}