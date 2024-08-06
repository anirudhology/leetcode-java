package com.anirudhology.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {
        // Array to store k closest points to origin
        final int[][] kClosestPoints = new int[k][2];
        // Min heap to store k closest points
        final Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        // Process every element in the array and store it in the heap
        for (int i = 0; i < points.length; i++) {
            int distance = calculateEuclideanDistance(points[i]);
            minHeap.offer(new int[]{distance, i});
        }
        // Get k closest points
        int i = 0;
        while (i < k) {
            int index = minHeap.remove()[1];
            kClosestPoints[i] = new int[]{points[index][0], points[index][1]};
            i++;
        }
        return kClosestPoints;
    }

    private int calculateEuclideanDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
