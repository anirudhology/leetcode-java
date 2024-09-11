package com.anirudhology.leetcode.array;

public class SortColors {

    public int[] sortColors(int[] nums) {
        // Pointers to track 0s, 1s and 2s
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        // The aim is to keep all 0s to left of 1s and all 2s to
        // the right of 1s
        while (middle <= right) {
            if (nums[middle] == 0) {
                swap(nums, left, middle);
                left++;
                middle++;
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                swap(nums, right, middle);
                right--;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
