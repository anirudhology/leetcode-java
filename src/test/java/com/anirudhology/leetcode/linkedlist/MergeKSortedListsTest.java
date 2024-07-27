package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeKSortedListsTest {

    private final MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
    
    @Test
    void testMergeKListsNull() {
        ListNode result = mergeKSortedLists.mergeKLists(null);
        assertNull(result);
    }

    @Test
    void testMergeKListsEmpty() {
        ListNode[] lists = new ListNode[0];
        ListNode result = mergeKSortedLists.mergeKLists(lists);
        assertNull(result);
    }

    @Test
    void testMergeKListsSingleList() {
        ListNode[] lists = new ListNode[1];
        lists[0] = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = mergeKSortedLists.mergeKLists(lists);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
    }

    @Test
    void testMergeKListsMultipleLists() {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));
        ListNode result = mergeKSortedLists.mergeKLists(lists);
        assertNotNull(result);
        int[] expectedValues = {1, 1, 2, 3, 4, 4, 5, 6};
        for (int value : expectedValues) {
            assertNotNull(result);
            assertEquals(value, result.val);
            result = result.next;
        }
        assertNull(result);
    }

    @Test
    void testMergeKListsEdgeCase() {
        ListNode[] lists = new ListNode[2];
        lists[0] = new ListNode(-1, new ListNode(3));
        lists[1] = new ListNode(-2, new ListNode(2, new ListNode(4)));
        ListNode result = mergeKSortedLists.mergeKLists(lists);
        assertNotNull(result);
        int[] expectedValues = {-2, -1, 2, 3, 4};
        for (int value : expectedValues) {
            assertNotNull(result);
            assertEquals(value, result.val);
            result = result.next;
        }
        assertNull(result);
    }
}