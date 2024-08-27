package com.anirudhology.leetcode.math;

public class HappyNumber {

    public boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        }
        while (n > 9) {
            n = calculateSquareOfDigits(n);
            if (n == 1 || n == 7) {
                return true;
            }
        }
        return false;
    }

    private int calculateSquareOfDigits(int n) {
        int square = 0;
        while (n > 0) {
            int remainder = n % 10;
            square += remainder * remainder;
            n /= 10;
        }
        return square;
    }
}
