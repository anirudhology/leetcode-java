package com.anirudhology.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0 || k < 0) {
            throw new IllegalArgumentException("Invalid inputs!");
        }
        // Map to store the frequencies of the elements in the array
        final Map<Integer, Integer> frequencies = new HashMap<>();
        for (final int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        // List to store buckets
        @SuppressWarnings("unchecked")
        final List<Integer>[] buckets = new List[nums.length + 1];
        // Populate the list with individual elements
        for (final int key : frequencies.keySet()) {
            int frequency = frequencies.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        // Array to store the final output
        int[] result = new int[k];
        // Populate the array
        for (int i = buckets.length - 1, j = 0; i >= 0 && j < k; i--) {
            if (buckets[i] != null) {
                for (int element : buckets[i]) {
                    result[j] = element;
                    j++;
                }
            }
        }
        return result;
    }
}
