package com.anirudhology.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeWaysTest {

    private final DecodeWays decodeWays = new DecodeWays();

    @Test
    public void testNumDecodings() {
        // Test case for null string
        assertEquals(0, decodeWays.numDecodings(null));

        // Test case for empty string
        assertEquals(0, decodeWays.numDecodings(""));

        // Test case for string with a single character
        assertEquals(1, decodeWays.numDecodings("1"));

        // Test case for string with multiple characters
        assertEquals(2, decodeWays.numDecodings("12")); // "AB" (1 2) or "L" (12)

        // Test case for string with leading zeros
        assertEquals(0, decodeWays.numDecodings("012"));

        // Test case for string with multiple decoding possibilities
        assertEquals(3, decodeWays.numDecodings("226")); // "BBF" (2 2 6), "BZ" (2 26), "VF" (22 6)

        // Test case for string with no valid decodings
        assertEquals(0, decodeWays.numDecodings("30"));

        // Test case for string with multiple valid decodings
        assertEquals(2, decodeWays.numDecodings("11106"));
    }
}