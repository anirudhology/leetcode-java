package com.anirudhology.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOf1BitsTest {

    private final NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @Test
    public void testHammingWeightZero() {
        assertEquals(0, numberOf1Bits.hammingWeight(0), "Hamming weight of 0 should be 0.");
    }

    @Test
    public void testHammingWeightOne() {
        assertEquals(1, numberOf1Bits.hammingWeight(1), "Hamming weight of 1 should be 1.");
    }

    @Test
    public void testHammingWeightLargeNumber() {
        assertEquals(3, numberOf1Bits.hammingWeight(11), "Hamming weight of 11 (binary 1011) should be 3.");
    }

    @Test
    public void testHammingWeightPowerOfTwo() {
        assertEquals(1, numberOf1Bits.hammingWeight(16), "Hamming weight of 16 (binary 10000) should be 1.");
    }

    @Test
    public void testHammingWeightMixedBits() {
        assertEquals(4, numberOf1Bits.hammingWeight(29), "Hamming weight of 29 (binary 11101) should be 4.");
    }

}