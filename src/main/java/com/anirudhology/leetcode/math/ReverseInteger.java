package com.anirudhology.leetcode.math;

public class ReverseInteger {

    public int reverse(int x) {
        final int maxValue = 2147483647;
        int xReverse = 0;
        int num = Math.abs(x);
        while (num != 0) {
            int remainder = num % 10;
            // Check for overflow
            if (xReverse > (maxValue - remainder) / 10) {
                return 0;
            }
            xReverse = 10 * xReverse + remainder;
            num /= 10;
        }
        return x < 0 ? -xReverse : xReverse;
    }
}
