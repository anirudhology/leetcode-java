package com.anirudhology.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void testAnagrams() {
        assertTrue(validAnagram.isAnagram("listen", "silent"));
        assertTrue(validAnagram.isAnagram("triangle", "integral"));
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testNonAnagrams() {
        assertFalse(validAnagram.isAnagram("hello", "world"));
        assertFalse(validAnagram.isAnagram("rat", "car"));
        assertFalse(validAnagram.isAnagram("abcd", "abce"));
    }

    @Test
    public void testDifferentLengths() {
        assertFalse(validAnagram.isAnagram("abc", "abcd"));
        assertFalse(validAnagram.isAnagram("a", ""));
    }

    @Test
    public void testEmptyStrings() {
        assertTrue(validAnagram.isAnagram("", ""));
    }

    @Test
    public void testRepeatedCharacters() {
        assertTrue(validAnagram.isAnagram("aabbcc", "abcabc"));
        assertFalse(validAnagram.isAnagram("aabbcc", "aabbc"));
    }

    @Test
    public void testSingleCharacters() {
        assertTrue(validAnagram.isAnagram("a", "a"));
        assertFalse(validAnagram.isAnagram("a", "b"));
    }
}