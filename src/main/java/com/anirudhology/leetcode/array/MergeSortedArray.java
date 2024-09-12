package com.anirudhology.leetcode.array;

public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // Indices to keep track of elements in both arrays
        int i = m - 1;
        int j = n - 1;
        // Current index
        int index = m + n - 1;
        // Process both arrays
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
        // Enter remaining elements
        while (i >= 0) {
            nums1[index] = nums1[i];
            i--;
            index--;
        }
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }
        return nums1;
    }
}
