package com.anirudhology.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyStringsTest {

    private final MultiplyStrings multiplyStrings = new MultiplyStrings();

    @Test
    public void testMultiplyWithZero() {
        assertEquals("0", multiplyStrings.multiply("0", "1234"));
        assertEquals("0", multiplyStrings.multiply("5678", "0"));
    }

    @Test
    public void testMultiplySingleDigitNumbers() {
        assertEquals("9", multiplyStrings.multiply("3", "3"));
        assertEquals("45", multiplyStrings.multiply("5", "9"));
    }

    @Test
    public void testMultiplyMultiDigitNumbers() {
        assertEquals("56088", multiplyStrings.multiply("123", "456"));
        assertEquals("998001", multiplyStrings.multiply("999", "999"));
    }
}