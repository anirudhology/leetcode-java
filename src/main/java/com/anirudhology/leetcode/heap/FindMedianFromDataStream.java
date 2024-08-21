package com.anirudhology.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream {

    class MedianFinder {

        private final Queue<Integer> minHeap; // This will store lower half
        private final Queue<Integer> maxHeap; // This will store upper half

        public MedianFinder() {
            this.minHeap = new PriorityQueue<>();
            this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        }

        public void addNum(int num) {
            // Add number to maxHeap first
            this.maxHeap.offer(num);
            this.minHeap.offer(this.maxHeap.remove());
            if (this.minHeap.size() > this.maxHeap.size()) {
                this.maxHeap.offer(this.minHeap.remove());
            }
        }

        public double findMedian() {
            // For odd number of elements
            if (maxHeap.size() > minHeap.size()) {
                return maxHeap.peek();
            }
            return (this.maxHeap.peek() + this.minHeap.peek()) / 2.0;
        }
    }
}
