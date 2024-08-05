package com.anirudhology.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.anirudhology.leetcode.heap.KthLargestElementInAStream.KthLargest;

class KthLargestElementInAStreamTest {

    @Test
    public void testKthLargest() {
        int[] nums = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, nums);

        assertEquals(4, kthLargest.add(3));   // returns 4
        assertEquals(5, kthLargest.add(5));   // returns 5
        assertEquals(5, kthLargest.add(10));  // returns 5
        assertEquals(8, kthLargest.add(9));   // returns 8
        assertEquals(8, kthLargest.add(4));   // returns 8
    }
}