package com.anirudhology.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowXNTest {

    private final PowXN powXN = new PowXN();

    @Test
    public void testPowerZeroExponent() {
        assertEquals(1.0, powXN.myPow(2.0, 0), 0.00001);
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.25, powXN.myPow(2.0, -2), 0.00001);
    }

    @Test
    public void testPowerPositiveExponentEven() {
        assertEquals(16.0, powXN.myPow(2.0, 4), 0.00001);
    }

    @Test
    public void testPowerPositiveExponentOdd() {
        assertEquals(8.0, powXN.myPow(2.0, 3), 0.00001);
    }

    @Test
    public void testPowerBaseZero() {
        assertEquals(0.0, powXN.myPow(0.0, 5), 0.00001);
    }

    @Test
    public void testPowerBaseOne() {
        assertEquals(1.0, powXN.myPow(1.0, 5), 0.00001);
    }

    @Test
    public void testPowerBaseNegativeOneOdd() {
        assertEquals(-1.0, powXN.myPow(-1.0, 3), 0.00001);
    }

    @Test
    public void testPowerBaseNegativeOneEven() {
        assertEquals(1.0, powXN.myPow(-1.0, 2), 0.00001);
    }
}