package com.anirudhology.leetcode.bitmanipulation;

public class ReverseBits {

    public int reverseBits(int n) {
        int output = 0;
        for (int i = 0; i < 32; i++) {
            // Shift the output left by 1 bit
            output <<= 1;
            // Check if the last digit of n is 1
            if ((n & 1) == 1) {
                output += 1;
            }
            // Drop the last digit from n as we have
            // processed it
            n >>= 1;
        }
        return output;
    }
}
