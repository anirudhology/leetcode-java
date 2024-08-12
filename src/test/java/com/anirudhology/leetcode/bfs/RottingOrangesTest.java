package com.anirudhology.leetcode.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RottingOrangesTest {

    private final RottingOranges rottingOranges = new RottingOranges();

    @Test
    public void testOrangesRotting_EmptyGrid() {
        int[][] grid = {};
        assertEquals(0, rottingOranges.orangesRotting(grid));
    }

    @Test
    public void testOrangesRotting_NoFreshOranges() {
        int[][] grid = {
                {2, 2, 0},
                {2, 0, 2},
                {0, 2, 2}
        };
        assertEquals(0, rottingOranges.orangesRotting(grid));
    }

    @Test
    public void testOrangesRotting_AllFreshOranges() {
        int[][] grid = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertEquals(-1, rottingOranges.orangesRotting(grid));
    }

    @Test
    public void testOrangesRotting_RottenSpread() {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, rottingOranges.orangesRotting(grid));
    }

    @Test
    public void testOrangesRotting_RottenSpreadWithUnreachable() {
        int[][] grid = {
                {2, 1, 1},
                {0, 1, 0},
                {1, 0, 1}
        };
        assertEquals(-1, rottingOranges.orangesRotting(grid));
    }
}