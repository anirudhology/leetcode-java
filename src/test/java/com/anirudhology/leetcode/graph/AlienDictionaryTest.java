package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlienDictionaryTest {

    private final AlienDictionary alienDictionary = new AlienDictionary();

    @Test
    public void testValidOrder() {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        assertEquals("wertf", alienDictionary.foreignDictionary(words));
    }

    @Test
    public void testInvalidOrderDueToCycle() {
        String[] words = {"z", "x", "z"};
        assertEquals("", alienDictionary.foreignDictionary(words));
    }

    @Test
    public void testInvalidOrderDueToPrefix() {
        String[] words = {"abc", "ab"};
        assertEquals("", alienDictionary.foreignDictionary(words));
    }

    @Test
    public void testSingleWord() {
        String[] words = {"abc"};
        assertEquals("abc", alienDictionary.foreignDictionary(words));
    }

    @Test
    public void testEmptyWords() {
        String[] words = {};
        assertEquals("", alienDictionary.foreignDictionary(words));
    }

    @Test
    public void testNoValidOrder() {
        String[] words = {"a", "b", "c"};
        assertEquals("abc", alienDictionary.foreignDictionary(words));
    }
}