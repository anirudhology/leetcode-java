package com.anirudhology.leetcode.array;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        // Special case
        if (nums == null || nums.length < 2) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Array to store the product
        int[] product = new int[n];
        // Cumulative product of the elements in the array
        int cumulativeProduct = 1;
        // Process the array left to right
        for (int i = 0; i < n; i++) {
            product[i] = cumulativeProduct;
            cumulativeProduct *= nums[i];
        }
        // Reset the cumulative product
        cumulativeProduct = 1;
        // Process the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            product[i] *= cumulativeProduct;
            cumulativeProduct *= nums[i];
        }
        return product;
    }
}
