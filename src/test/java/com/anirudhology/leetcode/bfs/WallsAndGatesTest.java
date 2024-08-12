package com.anirudhology.leetcode.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class WallsAndGatesTest {

    private final WallsAndGates wallsAndGates = new WallsAndGates();

    @Test
    public void testNullRooms() {
        assertNull(wallsAndGates.islandsAndTreasure(null));
    }

    @Test
    public void testEmptyRooms() {
        int[][] rooms = new int[0][0];
        assertArrayEquals(rooms, wallsAndGates.islandsAndTreasure(rooms));
    }

    @Test
    public void testSingleRoomWithGate() {
        int[][] rooms = {{0}};
        int[][] expected = {{0}};
        assertArrayEquals(expected, wallsAndGates.islandsAndTreasure(rooms));
    }

    @Test
    public void testSingleRoomWithWall() {
        int[][] rooms = {{-1}};
        int[][] expected = {{-1}};
        assertArrayEquals(expected, wallsAndGates.islandsAndTreasure(rooms));
    }

    @Test
    public void testSingleRoomWithEmpty() {
        int[][] rooms = {{Integer.MAX_VALUE}};
        int[][] expected = {{Integer.MAX_VALUE}};
        assertArrayEquals(expected, wallsAndGates.islandsAndTreasure(rooms));
    }

    @Test
    public void testGridWithMultipleGates() {
        int[][] rooms = {
                {Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };
        int[][] expected = {
                {3, -1, 0, 1},
                {2, 1, 1, -1},
                {1, -1, 1, -1},
                {0, -1, 2, 3}
        };
        assertArrayEquals(expected, wallsAndGates.islandsAndTreasure(rooms));
    }

    @Test
    public void testGridWithNoGates() {
        int[][] rooms = {
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };
        assertArrayEquals(rooms, wallsAndGates.islandsAndTreasure(rooms));
    }
}