package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EditDistanceTest {

    private final EditDistance editDistance = new EditDistance();

    @Test
    public void testMinDistanceEmptyStrings() {
        assertEquals(0, editDistance.minDistance("", ""));
    }

    @Test
    public void testMinDistanceOneEmptyString() {
        assertEquals(5, editDistance.minDistance("hello", ""));
        assertEquals(4, editDistance.minDistance("", "java"));
    }

    @Test
    public void testMinDistanceSameStrings() {
        assertEquals(0, editDistance.minDistance("same", "same"));
    }

    @Test
    public void testMinDistanceDifferentStrings() {
        assertEquals(3, editDistance.minDistance("horse", "ros"));
        assertEquals(5, editDistance.minDistance("intention", "execution"));
        assertEquals(2, editDistance.minDistance("flaw", "lawn"));
    }
}