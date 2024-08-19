package com.anirudhology.leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
        // Number of courses that one can take
        int count = 0;
        // Process every node in the queue
        while (!nodesWithZeroIndegree.isEmpty()) {
            count++;
            int node = nodesWithZeroIndegree.remove();
            // Decrement the indegree of the nodes neighbors
            for (int neighbor : adjacencyList.get(node)) {
                indegrees[neighbor]--;
                if (indegrees[neighbor] == 0) {
                    nodesWithZeroIndegree.offer(neighbor);
                }
            }
        }
        return count == numCourses;
    }
}
