package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void testMergeTwoLists() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode mergedList = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(1, mergedList.val);
        assertEquals(2, mergedList.next.val);
        assertEquals(3, mergedList.next.next.val);
        assertEquals(4, mergedList.next.next.next.val);
        assertEquals(5, mergedList.next.next.next.next.val);
        assertEquals(6, mergedList.next.next.next.next.next.val);
    }

    @Test
    public void testMergeWithNullList() {
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        ListNode mergedList = mergeTwoSortedLists.mergeTwoLists(null, list2);
        assertEquals(1, mergedList.val);
        assertEquals(2, mergedList.next.val);
        assertEquals(3, mergedList.next.next.val);
    }

    @Test
    public void testMergeBothNull() {
        ListNode mergedList = mergeTwoSortedLists.mergeTwoLists(null, null);
        assertNull(mergedList);
    }
}