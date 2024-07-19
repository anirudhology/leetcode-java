package com.anirudhology.leetcode.binarysearch;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Perform binary search on the range
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] > nums[right]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return nums[left];
    }
}
