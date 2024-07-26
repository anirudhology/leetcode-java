package com.anirudhology.leetcode.linkedlist;

public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        // Slow and fast pointers
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        // Reset fast pointer
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
