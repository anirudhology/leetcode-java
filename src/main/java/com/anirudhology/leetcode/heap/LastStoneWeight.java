package com.anirudhology.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        // Special case
        if (stones == null || stones.length == 0) {
            return 0;
        }
        // Max heap to store all the stones by weight
        final Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Add all stones to the heap
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size() > 1) {
            // Get two heaviest stones
            int x = maxHeap.remove();
            int y = maxHeap.remove();
            // Smash them together
            maxHeap.offer(x - y);
        }
        return maxHeap.remove();
    }
}
