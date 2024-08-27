package com.anirudhology.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetectSquaresTest {

    private final DetectSquares detectSquares = new DetectSquares();

    @Test
    public void testAddAndCount() {
        // Adding points
        detectSquares.add(new int[]{1, 2});
        detectSquares.add(new int[]{2, 1});
        detectSquares.add(new int[]{1, 0});
        detectSquares.add(new int[]{0, 1});

        // No squares should exist initially
        assertEquals(0, detectSquares.count(new int[]{1, 1}));

        // Adding points to form a square
        detectSquares.add(new int[]{2, 2});
        assertEquals(1, detectSquares.count(new int[]{1, 1}));

        // Adding a point to form a second square
        detectSquares.add(new int[]{0, 0});
        assertEquals(2, detectSquares.count(new int[]{1, 1}));
    }

    @Test
    public void testNoSquares() {
        // No points added, no squares should exist
        assertEquals(0, detectSquares.count(new int[]{0, 0}));
    }

    @Test
    public void testMultipleSamePoints() {
        // Adding the same point multiple times
        detectSquares.add(new int[]{0, 0});
        detectSquares.add(new int[]{0, 0});
        detectSquares.add(new int[]{1, 1});
        detectSquares.add(new int[]{1, 1});
        detectSquares.add(new int[]{0, 1});
        detectSquares.add(new int[]{1, 0});

        // Two squares are formed
        assertEquals(2, detectSquares.count(new int[]{0, 0}));
    }
}