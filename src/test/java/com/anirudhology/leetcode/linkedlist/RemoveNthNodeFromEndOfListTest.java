package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    void testRemoveNthFromEnd_EmptyList() {
        int n = 1;
        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(null, n);
        assertNull(result);
    }

    @Test
    void testRemoveNthFromEnd_SingleNode() {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);
        assertNull(result);
    }

    @Test
    void testRemoveNthFromEnd_RemoveFirstNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int n = 3;
        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);
        assertEquals(2, result.val);
        assertEquals(3, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    void testRemoveNthFromEnd_RemoveLastNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int n = 1;
        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    void testRemoveNthFromEnd_MiddleNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        int n = 2;
        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(4, result.next.next.val);
        assertNull(result.next.next.next);
    }
}