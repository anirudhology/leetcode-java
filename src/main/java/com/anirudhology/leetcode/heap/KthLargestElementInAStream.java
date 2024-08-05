package com.anirudhology.leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAStream {

    static class KthLargest {

        // Queue to represent min heap
        private final Queue<Integer> elements;
        // Capacity
        private final int capacity;

        public KthLargest(int k, int[] nums) {
            this.elements = new PriorityQueue<>();
            this.capacity = k;
            // Add k elements from nums to the min heap
            for (int num : nums) {
                add(num);
            }
        }

        public int add(int val) {
            // If we have fewer than k elements
            if (this.elements.size() < capacity) {
                this.elements.offer(val);
            } else if (this.elements.peek() < val) {
                this.elements.remove();
                this.elements.offer(val);
            }
            return this.elements.peek();
        }
    }
}
