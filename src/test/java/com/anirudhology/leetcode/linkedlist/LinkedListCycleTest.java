package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleTest {

    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void testHasCycleEmptyList() {
        assertFalse(linkedListCycle.hasCycle(null));
    }

    @Test
    public void testHasCycleSingleElementNoCycle() {
        ListNode head = new ListNode(1);
        assertFalse(linkedListCycle.hasCycle(head));
    }

    @Test
    public void testHasCycleMultipleElementsNoCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        assertFalse(linkedListCycle.hasCycle(head));
    }

    @Test
    public void testHasCycleMultipleElementsWithCycle() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next = second;
        second.next = third;
        third.next = second; // Creating a cycle
        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void testHasCycleCycleAtHead() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        second.next = head; // Creating a cycle at the head
        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void testHasCycleCycleAtMiddle() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creating a cycle at the second node
        assertTrue(linkedListCycle.hasCycle(head));
    }
}