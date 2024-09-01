package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistinctSubsequencesTest {

    private final DistinctSubsequences distinctSubsequences = new DistinctSubsequences();

    @Test
    public void testNumDistinctEmptyStrings() {
        assertEquals(1, distinctSubsequences.numDistinct("", ""));
    }

    @Test
    public void testNumDistinctEmptyTarget() {
        assertEquals(1, distinctSubsequences.numDistinct("abc", ""));
    }

    @Test
    public void testNumDistinctEmptySource() {
        assertEquals(0, distinctSubsequences.numDistinct("", "abc"));
    }

    @Test
    public void testNumDistinctSameStrings() {
        assertEquals(1, distinctSubsequences.numDistinct("abc", "abc"));
    }

    @Test
    public void testNumDistinctGeneralCases() {
        assertEquals(5, distinctSubsequences.numDistinct("babgbag", "bag"));
        assertEquals(3, distinctSubsequences.numDistinct("rabbbit", "rabbit"));
        assertEquals(0, distinctSubsequences.numDistinct("abc", "def"));
    }
}