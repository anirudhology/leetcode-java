package com.anirudhology.leetcode.quickselect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInAnArrayTest {

    private final KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();
    
    @Test
    public void testFindKthLargest() {
        assertEquals(5, kthLargestElementInAnArray.findKthLargest(new int[] {3,2,1,5,6,4}, 2));
        assertEquals(4, kthLargestElementInAnArray.findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
        assertEquals(1, kthLargestElementInAnArray.findKthLargest(new int[] {1}, 1));
        assertEquals(2, kthLargestElementInAnArray.findKthLargest(new int[] {1, 2}, 1));
        assertEquals(-1, kthLargestElementInAnArray.findKthLargest(new int[] {-1, -1}, 2));
    }
}