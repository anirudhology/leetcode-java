package com.anirudhology.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

public class MergeTripletsToFormTargetTriplet {

    public boolean mergeTriplets(int[][] triplets, int[] target) {
        // List to store indices of the valid triplets
        final List<Integer> validIndices = new ArrayList<>();
        // Remove all invalid indices
        for (int i = 0; i < triplets.length; i++) {
            if (triplets[i][0] <= target[0] && triplets[i][1] <= target[1] && triplets[i][2] <= target[2]) {
                validIndices.add(i);
            }
        }
        // Check if all the three elements are present
        boolean isXPresent = false;
        boolean isYPresent = false;
        boolean isZPresent = false;
        for (final int i : validIndices) {
            if (!isXPresent && triplets[i][0] == target[0]) {
                isXPresent = true;
            }
            if (!isYPresent && triplets[i][1] == target[1]) {
                isYPresent = true;
            }
            if (!isZPresent && triplets[i][2] == target[2]) {
                isZPresent = true;
            }
        }
        return isXPresent && isYPresent && isZPresent;
    }
}
