package com.anirudhology.leetcode.dynamicprogramming;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        // Total number of stairs
        int n = cost.length;
        // Variables to keep track of cost of climbing one or two stairs
        int a = cost[0];
        int b = cost[1];
        if (n == 2) {
            return Math.min(a, b);
        }
        for (int i = 2; i < n; i++) {
            int c = Math.min(a, b) + cost[i];
            a = b;
            b = c;
        }
        return Math.min(a, b);
    }
}
