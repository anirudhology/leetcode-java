package com.anirudhology.leetcode.heap;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        // Special case
        if (tasks == null || tasks.length == 0) {
            return 0;
        }
        // Array to store the frequency of every task
        final int[] frequencies = new int[26];
        for (char task : tasks) {
            frequencies[task - 'A']++;
        }
        // Max heap to store the task frequencies
        final Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int frequency : frequencies) {
            if (frequency > 0) {
                maxHeap.offer(frequency);
            }
        }
        // Queue to store the pair of tasks remaining and time
        // at which that task can be executed
        final Deque<int[]> pairs = new ArrayDeque<>();
        // Time to execute all tasks
        int time = 0;
        // Process the tasks
        while (!maxHeap.isEmpty() || !pairs.isEmpty()) {
            // If for the current task, the cooldown period is
            // elapsed, we can process it
            if (!pairs.isEmpty() && time >= pairs.peek()[1]) {
                maxHeap.offer(pairs.remove()[0]);
            }
            // Process the task
            if (!maxHeap.isEmpty()) {
                int remainingCount = maxHeap.remove() - 1;
                // If we still have task of the current type,
                // add it back to the queue
                if (remainingCount > 0) {
                    pairs.offer(new int[]{remainingCount, time + n + 1});
                }
            }
            time++;
        }
        return time;
    }
}
