package com.anirudhology.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesisStringTest {

    private final ValidParenthesisString validParenthesisString = new ValidParenthesisString();

    @Test
    public void testCheckValidString() {
        // Test null input
        assertTrue(validParenthesisString.checkValidString(null));

        // Test empty string
        assertTrue(validParenthesisString.checkValidString(""));

        // Test valid strings
        assertTrue(validParenthesisString.checkValidString("()"));
        assertTrue(validParenthesisString.checkValidString("(*)"));
        assertTrue(validParenthesisString.checkValidString("(*))"));

        // Test invalid strings
        assertFalse(validParenthesisString.checkValidString(")"));
        assertFalse(validParenthesisString.checkValidString(")("));
        assertTrue(validParenthesisString.checkValidString("((*)"));
        assertFalse(validParenthesisString.checkValidString("((*))("));
    }

    @Test
    public void testEdgeCases() {
        // Test string with only one *
        assertTrue(validParenthesisString.checkValidString("*"));

        // Test string with multiple *
        assertTrue(validParenthesisString.checkValidString("***"));

        // Test strings with nested parentheses
        assertTrue(validParenthesisString.checkValidString("(())"));
        assertFalse(validParenthesisString.checkValidString("(()))"));
    }
}