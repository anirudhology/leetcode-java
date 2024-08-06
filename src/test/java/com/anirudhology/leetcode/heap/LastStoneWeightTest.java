package com.anirudhology.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastStoneWeightTest {

    private final LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    public void testLastStoneWeight() {
        assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        assertEquals(0, lastStoneWeight.lastStoneWeight(new int[]{2, 2}));
        assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{1}));
        assertEquals(0, lastStoneWeight.lastStoneWeight(new int[]{}));
        assertEquals(0, lastStoneWeight.lastStoneWeight(null));
    }
}