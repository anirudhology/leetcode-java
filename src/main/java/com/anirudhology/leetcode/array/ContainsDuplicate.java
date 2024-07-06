package com.anirudhology.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        // Special case
        if  (nums == null || nums.length == 0) {
            return false;
        }
        // Set to store elements of the array
        final Set<Integer> elements = new HashSet<>();
        // Process each element one by one
        for (int num : nums) {
            if (!elements.add(num)) {
                return true;
            }
        }
        return false;
    }
}
