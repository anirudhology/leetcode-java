package com.anirudhology.leetcode.array;

public class TrappingRainWater {

    public int trap(int[] height) {
        // Special case
        if (height == null || height.length == 0) {
            return 0;
        }
        // Left and right pointers
        int left = 0;
        int right = height.length - 1;
        // Variables to keep track of maximum height to the
        // left of the current pointer and maximum height to
        // the right of the current pointer
        int leftHeight = 0;
        int rightHeight = 0;
        // Trapped area
        int area = 0;
        // Process the array from both ends
        while (left <= right) {
            if (leftHeight <= rightHeight) {
                area += Math.max(0, leftHeight - height[left]);
                leftHeight = Math.max(leftHeight, height[left]);
                left++;
            } else {
                area += Math.max(0, rightHeight - height[right]);
                rightHeight = Math.max(rightHeight, height[right]);
                right--;
            }
        }
        return area;
    }
}
