package com.anirudhology.leetcode.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0 || k <= 0) {
            return nums;
        }
        // Length of the array
        final int n = nums.length;
        // Array to store the maximums of the sliding windows
        final int[] slidingWindowMax = new int[n - k + 1];
        // Deque to store the elements of the sliding window
        final Deque<Integer> deque = new ArrayDeque<>();
        // Add first k elements to the deque
        for (int i = 0; i < n; i++) {
            // Remove elements from the left
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            // Remove elements from the deque which are less than nums[i] as they
            // can never become max
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            // Add current index to the deque
            deque.offerLast(i);
            if (i >= k - 1) {
                //noinspection DataFlowIssue
                slidingWindowMax[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return slidingWindowMax;
    }
}
