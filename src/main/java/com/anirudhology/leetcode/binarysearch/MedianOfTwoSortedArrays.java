package com.anirudhology.leetcode.binarysearch;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Make sure that the length of nums1 is smaller than nums2
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        // Lengths of both arrays
        int m = nums1.length;
        int n = nums2.length;
        // Left and right pointers in the first array
        int left = 0;
        int right = m;
        // Perform binary search on the arrays
        while (left <= right) {
            // Find partitions for both arrays
            int partitionM = left + (right - left) / 2;
            int partitionN = (m + n + 1) / 2 - partitionM;
            // Find elements at the boundaries of both arrays
            int maxLeftM = partitionM == 0 ? Integer.MIN_VALUE : nums1[partitionM - 1];
            int minRightM = partitionM == m ? Integer.MAX_VALUE : nums1[partitionM];
            int maxLeftN = partitionN == 0 ? Integer.MIN_VALUE : nums2[partitionN - 1];
            int minRightN = partitionN == n ? Integer.MAX_VALUE : nums2[partitionN];
            // If we have found the correct boundaries
            if (maxLeftM <= minRightN && maxLeftN <= minRightM) {
                if ((m + n) % 2 == 0) {
                    return (1.0 * Math.max(maxLeftM, maxLeftN) + Math.min(minRightM, minRightN)) / 2;
                } else {
                    return 1.0 * Math.max(maxLeftM, maxLeftN);
                }
            }
            // We are too far on right side, and we need to move towards left
            else if (maxLeftM > minRightN) {
                right = partitionM - 1;
            } else {
                left = partitionM + 1;
            }
        }
        // Should never reach here
        throw new IllegalArgumentException("Invalid inputs!");
    }
}
