package com.anirudhology.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseBitsTest {

    private final ReverseBits reverseBits = new ReverseBits();

    @Test
    public void testReverseBitsWithZero() {
        assertEquals(0, reverseBits.reverseBits(0), "Reversing bits of 0 should return 0.");
    }

    @Test
    public void testReverseBitsWithOne() {
        assertEquals(0b10000000000000000000000000000000, reverseBits.reverseBits(1), "Reversing bits of 1 should return 2147483648.");
    }

    @Test
    public void testReverseBitsWithMaxInteger() {
        assertEquals(0xFFFFFFFF, reverseBits.reverseBits(0xFFFFFFFF), "Reversing bits of 0xFFFFFFFF should return 0xFFFFFFFF.");
    }

    @Test
    public void testReverseBitsWithMinInteger() {
        assertEquals(1, reverseBits.reverseBits(0x80000000), "Reversing bits of 0x80000000 should return 1.");
    }

    @Test
    public void testReverseBitsWithNegativeOne() {
        assertEquals(0xFFFFFFFF, reverseBits.reverseBits(-1), "Reversing bits of -1 should return 0xFFFFFFFF.");
    }

    @Test
    public void testReverseBitsWithSpecificNumber() {
        assertEquals(964176192, reverseBits.reverseBits(43261596), "Reversing bits of 43261596 should return 964176192.");
    }
}