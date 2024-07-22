package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {

    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void testReverseEmptyList() {
        ListNode result = reverseLinkedList.reverseList(null);
        assertNull(result);
    }

    @Test
    void testReverseSingleElementList() {
        ListNode head = new ListNode(1);
        ListNode result = reverseLinkedList.reverseList(head);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    void testReverseMultipleElementList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode result = reverseLinkedList.reverseList(head);

        assertNotNull(result);
        assertEquals(3, result.val);
        assertNotNull(result.next);
        assertEquals(2, result.next.val);
        assertNotNull(result.next.next);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void testReverseTwoElementList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode result = reverseLinkedList.reverseList(head);

        assertNotNull(result);
        assertEquals(2, result.val);
        assertNotNull(result.next);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }
}