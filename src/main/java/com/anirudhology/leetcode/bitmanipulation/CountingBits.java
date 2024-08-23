package com.anirudhology.leetcode.bitmanipulation;

public class CountingBits {

    public int[] countBits(int n) {
        // Lookup table to store count of set bits
        final int[] lookup = new int[n + 1];
        // Exponent of 2
        int offset = 1;
        // Populate the table
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) {
                offset *= 2;
            }
            lookup[i] = lookup[i - offset] + 1;
        }
        return lookup;
    }
}
