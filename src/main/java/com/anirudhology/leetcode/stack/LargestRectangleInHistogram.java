package com.anirudhology.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        // Special case
        if (heights == null || heights.length == 0) {
            return 0;
        }
        // Length of the array
        int n = heights.length;
        // Monotonic stack for indices
        final Deque<Integer> stack = new ArrayDeque<>();
        // Max area
        int maxArea = 0;
        // Process the array
        for (int i = 0; i <= n; i++) {
            int height = i == n ? 0 : heights[i];
            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int currentHeight = heights[stack.pop()];
                int currentWidth = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, currentHeight * currentWidth);
            }
            // Insert current index to the stack
            stack.push(i);
        }
        return maxArea;
    }
}
