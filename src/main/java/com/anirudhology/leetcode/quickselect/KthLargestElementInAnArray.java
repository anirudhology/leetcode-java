package com.anirudhology.leetcode.quickselect;

public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        // Update k to make kth-largest element (because QuickSelect works
        // for kth-smallest element)
        k = nums.length - k;
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Process array from both ends
        while (left < right) {
            int pivotIndex = partition(nums, left, right);
            if (pivotIndex < k) {
                pivotIndex = pivotIndex + 1;
            } else if (pivotIndex > k) {
                right = pivotIndex - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int pivotIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivot) {
                int temp = nums[pivotIndex];
                nums[pivotIndex] = nums[i];
                nums[i] = temp;
                pivotIndex++;
            }
        }
        nums[right] = nums[pivotIndex];
        nums[pivotIndex] = pivot;
        return pivotIndex;
    }
}
