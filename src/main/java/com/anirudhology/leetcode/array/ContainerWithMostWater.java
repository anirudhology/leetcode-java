package com.anirudhology.leetcode.array;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        // Special case
        if (height == null || height.length == 0) {
            return 0;
        }
        // Global max area
        int maxArea = 0;
        // Left and right pointers
        int left = 0;
        int right = height.length - 1;
        // Process the array from both sides
        while (left <= right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(h * w, maxArea);
            // Update left and right pointers accordingly
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }

        }
        return maxArea;
    }
}
