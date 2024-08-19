package com.anirudhology.leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Adjacency list
        final List<List<Integer>> adjacencyList = new ArrayList<>();
        // Array to store the indegree of every node
        final int[] indegrees = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            adjacencyList.get(prerequisite[1]).add(prerequisite[0]);
            indegrees[prerequisite[0]]++;
        }
        // Queue to store all nodes with indegree 0
        final Queue<Integer> nodesWithZeroIndegree = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) {
                nodesWithZeroIndegree.offer(i);
            }
        }
        // List to store ordering of the courses
        final List<Integer> order = new ArrayList<>();
        // Process every node in the queue
        while (!nodesWithZeroIndegree.isEmpty()) {
            int node = nodesWithZeroIndegree.remove();
            order.add(node);
            // Decrement the indegree of the nodes neighbors
            for (int neighbor : adjacencyList.get(node)) {
                indegrees[neighbor]--;
                if (indegrees[neighbor] == 0) {
                    nodesWithZeroIndegree.offer(neighbor);
                }
            }
        }
        if (order.size() != numCourses) {
            return new int[0];
        }
        // Array to store final output
        final int[] result = new int[order.size()];
        for (int i = 0; i < numCourses; i++) {
            result[i] = order.get(i);
        }
        return result;
    }
}
