package com.anirudhology.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testSearchNullArray() {
        assertEquals(-1, binarySearch.search(null, 5));
    }

    @Test
    public void testSearchEmptyArray() {
        assertEquals(-1, binarySearch.search(new int[]{}, 5));
    }

    @Test
    public void testSearchSingleElementArrayFound() {
        assertEquals(0, binarySearch.search(new int[]{5}, 5));
    }

    @Test
    public void testSearchSingleElementArrayNotFound() {
        assertEquals(-1, binarySearch.search(new int[]{5}, 3));
    }

    @Test
    public void testSearchMultipleElementsFound() {
        assertEquals(2, binarySearch.search(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(0, binarySearch.search(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(4, binarySearch.search(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void testSearchMultipleElementsNotFound() {
        assertEquals(-1, binarySearch.search(new int[]{1, 2, 3, 4, 5}, 0));
        assertEquals(-1, binarySearch.search(new int[]{1, 2, 3, 4, 5}, 6));
    }

    @Test
    public void testSearchWithDuplicates() {
        assertEquals(3, binarySearch.search(new int[]{1, 2, 2, 2, 3, 4, 5}, 2));
    }
}