package com.anirudhology.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void testNullString() {
        assertTrue(validPalindrome.isPalindrome(null));
    }

    @Test
    public void testEmptyString() {
        assertTrue(validPalindrome.isPalindrome(""));
    }

    @Test
    public void testSingleCharacterString() {
        assertTrue(validPalindrome.isPalindrome("a"));
        assertTrue(validPalindrome.isPalindrome("Z"));
        assertTrue(validPalindrome.isPalindrome("1"));
    }

    @Test
    public void testValidPalindrome() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(validPalindrome.isPalindrome("racecar"));
        assertTrue(validPalindrome.isPalindrome("0P0"));
    }

    @Test
    public void testInvalidPalindrome() {
        assertFalse(validPalindrome.isPalindrome("hello"));
        assertFalse(validPalindrome.isPalindrome("race a car"));
        assertFalse(validPalindrome.isPalindrome("abc123"));
    }

    @Test
    public void testMixedAlphanumeric() {
        assertTrue(validPalindrome.isPalindrome("A1b2B1a"));
        assertFalse(validPalindrome.isPalindrome("A1b2B3a"));
    }

    @Test
    public void testSpecialCharacters() {
        assertTrue(validPalindrome.isPalindrome("!@#$%^&*()_+"));
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal, Panama!"));
        assertTrue(validPalindrome.isPalindrome("No 'x' in Nixon"));
    }
}