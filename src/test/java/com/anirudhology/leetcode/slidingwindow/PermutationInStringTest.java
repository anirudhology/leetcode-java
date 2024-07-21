package com.anirudhology.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationInStringTest {

    private final PermutationInString permutationInString = new PermutationInString();

    @Test
    public void testEmptyS1() {
        assertTrue(permutationInString.checkInclusion("", "anything"));
    }

    @Test
    public void testEmptyS2() {
        assertFalse(permutationInString.checkInclusion("anything", ""));
    }

    @Test
    public void testS1LongerThanS2() {
        assertFalse(permutationInString.checkInclusion("longstring", "short"));
    }

    @Test
    public void testExactMatch() {
        assertTrue(permutationInString.checkInclusion("abc", "cba"));
    }

    @Test
    public void testPermutationInMiddle() {
        assertFalse(permutationInString.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void testPermutationAtStart() {
        assertTrue(permutationInString.checkInclusion("ab", "abdcba"));
    }

    @Test
    public void testNoPermutation() {
        assertFalse(permutationInString.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    public void testRepeatedCharactersInS1() {
        assertTrue(permutationInString.checkInclusion("aabb", "bbbaaabbcc"));
    }

    @Test
    public void testRepeatedCharactersInS2() {
        assertTrue(permutationInString.checkInclusion("abc", "aabbcc"));
    }

    @Test
    public void testDifferentCharacters() {
        assertFalse(permutationInString.checkInclusion("abc", "defghijkl"));
    }
}