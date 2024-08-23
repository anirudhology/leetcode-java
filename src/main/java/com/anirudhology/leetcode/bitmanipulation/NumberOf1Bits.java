package com.anirudhology.leetcode.bitmanipulation;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int setBits = 0;
        while (n > 0) {
            n &= (n - 1);
            setBits++;
        }
        return setBits;
    }
}
