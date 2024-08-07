package com.anirudhology.leetcode.dynamicprogramming;

public class ClimbingStairs {

    public int climbStairs(int n) {
        // Special cases
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        // Variables to store ways to climb previous two steps
        int a = 1;
        int b = 2;
        int c = a + b;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
