package com.anirudhology.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Set to store the elements of the array
        final Set<Integer> elements = new HashSet<>();
        // Add all elements of the array to the set for O(1) retrieval
        for (int num : nums) {
            elements.add(num);
        }
        // Length of longest consecutive sequence
        int lcsLength = 0;
        // Process the elements in the array
        for (int num : nums) {
            // Current element
            int currentElement = num;
            // If previous number to current element does not exist in
            // the hash set, it means it is the first element in a
            // sequence
            if (!elements.contains(currentElement - 1)) {
                int currentLength = 1;
                while (elements.contains(currentElement + 1)) {
                    currentLength++;
                    currentElement++;
                }
                lcsLength = Math.max(lcsLength, currentLength);
            }
        }
        return lcsLength;
    }
}
