package com.anirudhology.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void testReversePositiveNumber() {
        assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    public void testReverseNegativeNumber() {
        assertEquals(-321, reverseInteger.reverse(-123));
    }

    @Test
    public void testReverseZero() {
        assertEquals(0, reverseInteger.reverse(0));
    }

    @Test
    public void testReverseOverflow() {
        assertEquals(0, reverseInteger.reverse(1534236469));
    }

    @Test
    public void testReverseSingleDigit() {
        assertEquals(9, reverseInteger.reverse(9));
    }
}