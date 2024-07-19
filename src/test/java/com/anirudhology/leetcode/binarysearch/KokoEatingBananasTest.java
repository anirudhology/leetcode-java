package com.anirudhology.leetcode.binarysearch;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KokoEatingBananasTest {

    private final KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();

    @Test
    public void testMinEatingSpeedEmptyPiles() {
        assertEquals(0, kokoEatingBananas.minEatingSpeed(new int[]{}, 5));
    }

    @Test
    public void testMinEatingSpeed_nullPiles() {
        assertEquals(0, kokoEatingBananas.minEatingSpeed(null, 5));
    }

    @Test
    public void testMinEatingSpeedZeroOrNegativeHours() {
        assertEquals(0, kokoEatingBananas.minEatingSpeed(new int[]{3, 6, 7, 11}, 0));
        assertEquals(0, kokoEatingBananas.minEatingSpeed(new int[]{3, 6, 7, 11}, -1));
    }

    @Test
    public void testMinEatingSpeedSinglePileSingleHour() {
        assertEquals(100, kokoEatingBananas.minEatingSpeed(new int[]{100}, 1));
    }

    @Test
    public void testMinEatingSpeedSinglePileMultipleHours() {
        assertEquals(10, kokoEatingBananas.minEatingSpeed(new int[]{100}, 10));
    }

    @Test
    public void testMinEatingSpeedMultiplePilesExactHours() {
        assertEquals(4, kokoEatingBananas.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    @Test
    public void testMinEatingSpeedMultiplePilesMoreHours() {
        assertEquals(23, kokoEatingBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

    @Test
    public void testMinEatingSpeedMultiplePilesFewerHours() {
        assertEquals(30, kokoEatingBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
    }

    @Test
    public void testMinEatingSpeedLargePiles() {
        assertEquals(500000000, kokoEatingBananas.minEatingSpeed(new int[]{1000000000}, 2));
    }

    @Test
    public void testMinEatingSpeedUniformPilesExactHours() {
        assertEquals(1, kokoEatingBananas.minEatingSpeed(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 10));
    }

    @Test
    public void testMinEatingSpeedUniformPilesMoreHours() {
        assertEquals(1, kokoEatingBananas.minEatingSpeed(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 20));
    }

    @Test
    public void testMinEatingSpeedUniformPilesFewerHours() {
        assertEquals(1, kokoEatingBananas.minEatingSpeed(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 5));
    }
}