package com.anirudhology.leetcode.bfs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PacificAtlanticWaterFlowTest {

    private final PacificAtlanticWaterFlow pacificAtlanticWaterFlow = new PacificAtlanticWaterFlow();

    @Test
    public void testPacificAtlantic_EmptyGrid() {
        int[][] heights = {};
        List<List<Integer>> result = pacificAtlanticWaterFlow.pacificAtlantic(heights);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testPacificAtlantic_SingleCellGrid() {
        int[][] heights = {{1}};
        List<List<Integer>> result = pacificAtlanticWaterFlow.pacificAtlantic(heights);
        assertEquals(List.of(List.of(0, 0)), result);
    }

    @Test
    public void testPacificAtlantic_FlatGrid() {
        int[][] heights = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        List<List<Integer>> result = pacificAtlanticWaterFlow.pacificAtlantic(heights);
        assertEquals(9, result.size()); // All cells should be reachable by both oceans
    }

    @Test
    public void testPacificAtlantic_MountainGrid() {
        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<List<Integer>> result = pacificAtlanticWaterFlow.pacificAtlantic(heights);
        assertEquals(7, result.size()); // Specific cells should be reachable by both oceans
    }
}