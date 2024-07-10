package com.anirudhology.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    public void testProductExceptSelfWithNullArray() {
        int[] result = productOfArrayExceptSelf.productExceptSelf(null);
        assertNull(result);
    }

    @Test
    public void testProductExceptSelfWithSingleElement() {
        int[] nums = {1};
        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void testProductExceptSelfWithTwoElements() {
        int[] nums = {1, 2};
        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{2, 1}, result);
    }

    @Test
    public void testProductExceptSelfWithMultipleElements() {
        int[] nums = {1, 2, 3, 4};
        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }

    @Test
    public void testProductExceptSelfWithZeros() {
        int[] nums = {1, 2, 0, 4};
        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{0, 0, 8, 0}, result);
    }

    @Test
    public void testProductExceptSelfWithMultipleZeros() {
        int[] nums = {0, 0, 2, 4};
        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{0, 0, 0, 0}, result);
    }

    @Test
    public void testProductExceptSelfWithNegativeNumbers() {
        int[] nums = {-1, 2, -3, 4};
        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{-24, 12, -8, 6}, result);
    }
}