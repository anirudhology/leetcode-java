package com.anirudhology.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMedianFromDataStreamTest {

    @Test
    public void testAddNumAndFindMedian() {
        FindMedianFromDataStream.MedianFinder medianFinder = new FindMedianFromDataStream.MedianFinder();

        medianFinder.addNum(1);
        assertEquals(1.0, medianFinder.findMedian(), 0.0);

        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.findMedian(), 0.0);

        medianFinder.addNum(3);
        assertEquals(2.0, medianFinder.findMedian(), 0.0);

        medianFinder.addNum(4);
        assertEquals(2.5, medianFinder.findMedian(), 0.0);

        medianFinder.addNum(5);
        assertEquals(3.0, medianFinder.findMedian(), 0.0);
    }

    @Test
    public void testSingleElement() {
        FindMedianFromDataStream.MedianFinder medianFinder = new FindMedianFromDataStream.MedianFinder();

        medianFinder.addNum(10);
        assertEquals(10.0, medianFinder.findMedian(), 0.0);
    }
}