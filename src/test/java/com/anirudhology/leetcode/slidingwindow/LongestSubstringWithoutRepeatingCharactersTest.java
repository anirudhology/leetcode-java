package com.anirudhology.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void testEmptyString() {
        assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
    }

    @Test
    public void testNullString() {
        assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(null));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("a"));
    }

    @Test
    public void testAllUniqueCharacters() {
        assertEquals(5, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcde"));
    }

    @Test
    public void testAllSameCharacters() {
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aaaaa"));
    }

    @Test
    public void testMixedCharacters() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testStringWithSpaces() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("a b c a b c b b"));
    }

    @Test
    public void testStringWithNumbers() {
        assertEquals(10, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("1234567890"));
    }

    @Test
    public void testComplexString() {
        assertEquals(7, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkewabcdef"));
    }
}