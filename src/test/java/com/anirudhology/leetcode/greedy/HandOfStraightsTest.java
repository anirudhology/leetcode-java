package com.anirudhology.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HandOfStraightsTest {

    private final HandOfStraights handOfStraights = new HandOfStraights();

    @Test
    void testIsNStraightHandValid() {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        assertTrue(handOfStraights.isNStraightHand(hand, groupSize));
    }

    @Test
    void testIsNStraightHandInvalid() {
        int[] hand = {1, 2, 3, 4, 5};
        int groupSize = 4;
        assertFalse(handOfStraights.isNStraightHand(hand, groupSize));
    }

    @Test
    void testIsNStraightHandEmptyHand() {
        int[] hand = {};
        int groupSize = 1;
        assertTrue(handOfStraights.isNStraightHand(hand, groupSize));  // An empty hand should return true
    }

    @Test
    void testIsNStraightHandSingleGroup() {
        int[] hand = {1, 2, 3};
        int groupSize = 3;
        assertTrue(handOfStraights.isNStraightHand(hand, groupSize));
    }

    @Test
    void testIsNStraightHandGroupSizeOne() {
        int[] hand = {1, 2, 3, 4};
        int groupSize = 1;
        assertTrue(handOfStraights.isNStraightHand(hand, groupSize));  // Every single card is its own group
    }

    @Test
    void testIsNStraightHandGroupSizeLargerThanHand() {
        int[] hand = {1, 2, 3};
        int groupSize = 4;
        assertFalse(handOfStraights.isNStraightHand(hand, groupSize));  // Group size cannot be larger than the hand size
    }

    @Test
    void testIsNStraightHandDuplicateCards() {
        int[] hand = {1, 1, 2, 2, 3, 3};
        int groupSize = 3;
        assertTrue(handOfStraights.isNStraightHand(hand, groupSize));  // Duplicate cards should still form groups
    }
}