package com.anirudhology.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void testEmptyString() {
        assertTrue(validParentheses.isValid(""));
    }

    @Test
    void testSingleLeftParenthesis() {
        assertFalse(validParentheses.isValid("("));
    }

    @Test
    void testSingleRightParenthesis() {
        assertFalse(validParentheses.isValid(")"));
    }

    @Test
    void testSingleLeftBrace() {
        assertFalse(validParentheses.isValid("{"));
    }

    @Test
    void testSingleRightBrace() {
        assertFalse(validParentheses.isValid("}"));
    }

    @Test
    void testSingleLeftBracket() {
        assertFalse(validParentheses.isValid("["));
    }

    @Test
    void testSingleRightBracket() {
        assertFalse(validParentheses.isValid("]"));
    }

    @Test
    void testValidSimple() {
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("[]"));
        assertTrue(validParentheses.isValid("{}"));
    }

    @Test
    void testValidNested() {
        assertTrue(validParentheses.isValid("({[]})"));
        assertTrue(validParentheses.isValid("[{()}]"));
        assertTrue(validParentheses.isValid("{[()]}"));
    }

    @Test
    void testInvalidMixed() {
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("[)"));
        assertFalse(validParentheses.isValid("{)"));
    }

    @Test
    void testInvalidUnmatchedLeft() {
        assertFalse(validParentheses.isValid("({["));
    }

    @Test
    void testInvalidUnmatchedRight() {
        assertFalse(validParentheses.isValid(")}]"));
    }

    @Test
    void testValidComplex() {
        assertTrue(validParentheses.isValid("{[()()]()}"));
    }

    @Test
    void testInvalidComplex() {
        assertFalse(validParentheses.isValid("{[()([)]}"));
    }

    @Test
    void testValidWithRepeatedCharacters() {
        assertTrue(validParentheses.isValid("()()()"));
        assertTrue(validParentheses.isValid("[][][]"));
        assertTrue(validParentheses.isValid("{}{}{}"));
    }

    @Test
    void testInvalidWithRepeatedCharacters() {
        assertFalse(validParentheses.isValid("((())"));
        assertFalse(validParentheses.isValid("{{{{}}"));
        assertTrue(validParentheses.isValid("[[[]]]"));
    }

    @Test
    void testNullString() {
        assertTrue(validParentheses.isValid(null));
    }
}