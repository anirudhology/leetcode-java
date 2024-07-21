package com.anirudhology.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestRepeatingCharacterReplacementTest {

    private final LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();

    @Test
    public void testCharacterReplacement_EmptyString() {
        assertEquals(0, longestRepeatingCharacterReplacement.characterReplacement("", 2));
    }

    @Test
    public void testCharacterReplacement_NullString() {
        assertEquals(0, longestRepeatingCharacterReplacement.characterReplacement(null, 2));
    }

    @Test
    public void testCharacterReplacement_NegativeK() {
        assertEquals(0, longestRepeatingCharacterReplacement.characterReplacement("AABABBA", -1));
    }

    @Test
    public void testCharacterReplacement_SingleCharacterString() {
        assertEquals(1, longestRepeatingCharacterReplacement.characterReplacement("A", 2));
    }

    @Test
    public void testCharacterReplacement_KGreaterThanLength() {
        assertEquals(5, longestRepeatingCharacterReplacement.characterReplacement("ABCDE", 10));
    }

    @Test
    public void testCharacterReplacement_NoReplacementNeeded() {
        assertEquals(4, longestRepeatingCharacterReplacement.characterReplacement("AAAA", 2));
    }

    @Test
    public void testCharacterReplacement_GeneralCase() {
        assertEquals(4, longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1));
    }

    @Test
    public void testCharacterReplacement_MixedCase() {
        assertEquals(4, longestRepeatingCharacterReplacement.characterReplacement("ABAB", 2));
    }

    @Test
    public void testCharacterReplacement_AllDifferentCharacters() {
        assertEquals(1, longestRepeatingCharacterReplacement.characterReplacement("ABCDE", 0));
    }

    @Test
    public void testCharacterReplacement_KZero() {
        assertEquals(1, longestRepeatingCharacterReplacement.characterReplacement("ABCDE", 0));
    }
}