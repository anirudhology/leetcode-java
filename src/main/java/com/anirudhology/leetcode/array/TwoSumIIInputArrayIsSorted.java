package com.anirudhology.leetcode.array;

public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        // Special case
        if (numbers == null || numbers.length < 2) {
            return null;
        }
        // Left and right pointers
        int left = 0;
        int right = numbers.length - 1;
        // Array to store the final output
        int[] result = new int[2];
        // Process the array from both ends
        while (left <= right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
