package com.anirudhology.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

    @Test
    public void testSearchFound() {
        assertEquals(4, searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(0, searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
        assertEquals(6, searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));
        assertEquals(0, searchInRotatedSortedArray.search(new int[]{1, 3}, 1));
        assertEquals(1, searchInRotatedSortedArray.search(new int[]{3, 1}, 1));
    }

    @Test
    public void testSearchNotFound() {
        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{1}, 0));
        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{}, 1));
    }

    @Test
    public void testSearchEdgeCases() {
        assertEquals(0, searchInRotatedSortedArray.search(new int[]{1}, 1));
        assertEquals(-1, searchInRotatedSortedArray.search(null, 1));

    }
}