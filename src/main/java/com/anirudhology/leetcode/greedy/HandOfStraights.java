package com.anirudhology.leetcode.greedy;

import java.util.PriorityQueue;

public class HandOfStraights {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        // Min heap to store the elements in the hand
        final PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int card : hand) {
            minHeap.offer(card);
        }
        // Process the minHeap
        while (!minHeap.isEmpty()) {
            int card = minHeap.remove();
            // Check if consecutive cards are present for this
            // card or not
            for (int i = 1; i < groupSize; i++) {
                if (!minHeap.remove(card + i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
