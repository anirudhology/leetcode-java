package com.anirudhology.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        // List to store the triplets
        final List<List<Integer>> triplets = new ArrayList<>();
        // Special case
        if (nums == null || nums.length < 3) {
            return triplets;
        }
        // Length of the array
        int n = nums.length;
        // Sort the array
        Arrays.sort(nums);
        // Process the array
        for (int i = 0; i < n; i++) {
            // Skip duplicates, if any
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // Left and right pointers for the remaining array
            int j = i + 1;
            int k = n - 1;
            // Process the remaining array from both ends
            while (j < k) {
                // Sum of three elements
                int sum = nums[i] + nums[j] + nums[k];
                // If we have found the correct triplet
                if (sum == 0) {
                    triplets.add(List.of(nums[i], nums[j], nums[k]));
                    // Skip further duplicates
                    do {
                        j++;
                    } while (j < k && nums[j - 1] == nums[j]);
                }
                // If the sum is negative, it means we are too left
                // and we need to move right
                else if (sum < 0) {
                    j++;
                }
                // If the sum is positive, it means we are too right
                // and we need to move left
                else {
                    k--;
                }
            }
        }
        return triplets;
    }
}
