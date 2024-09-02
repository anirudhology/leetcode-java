package com.anirudhology.leetcode.dynamicprogramming;

import java.util.Arrays;

public class BurstBalloons {

    public int maxCoins(int[] nums) {
        // Array to store balloons with two dummy balloons
        final int[] balloons = new int[nums.length + 2];
        // Total balloons now
        final int n = balloons.length;
        balloons[0] = 1;
        balloons[n - 1] = 1;
        System.arraycopy(nums, 0, balloons, 1, n - 1 - 1);
        // Lookup table
        final int[][] lookup = new int[n - 1][n - 1];
        Arrays.stream(lookup).forEach(a -> Arrays.fill(a, -1));
        // Burst balloons between indices 1 and n - 2
        return burst(balloons, 1, n - 2, lookup);
    }

    private int burst(int[] balloons, int i, int j, int[][] lookup) {
        // Base case
        if (i > j) {
            return 0;
        }
        // If only one balloon exists
        if (i == j) {
            int temp = balloons[i];
            if (i - 1 >= 0) {
                temp *= balloons[i - 1];
            }
            if (i + 1 < balloons.length) {
                temp *= balloons[i + 1];
            }
            return temp;
        }
        if (lookup[i][j] != -1) {
            return lookup[i][j];
        }
        // Score
        int score = 0;
        // For all elements withing range i and j, we burst each balloon
        // in the last one by one
        for (int k = i; k <= j; k++) {
            // Burst the k-th balloon after bursting (i, k - 1) and (k + 1, j) balloons
            int temp = balloons[k];
            if (j + 1 < balloons.length) {
                temp *= balloons[j + 1];
            }
            if (i - 1 >= 0) {
                temp *= balloons[i - 1];
            }
            // Recursively solve left and right halves
            temp += (burst(balloons, i, k - 1, lookup) + burst(balloons, k + 1, j, lookup));
            // Update the score, if required
            score = Math.max(score, temp);
        }
        lookup[i][j] = score;
        return score;
    }
}
