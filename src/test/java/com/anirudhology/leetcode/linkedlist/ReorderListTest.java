package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReorderListTest {

    private final ReorderList reorderList = new ReorderList();

    private ListNode buildList(int... values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private void assertListEquals(ListNode head, int... values) {
        for (int value : values) {
            assertNotNull(head);
            assertEquals(value, head.val);
            head = head.next;
        }
        assertNull(head);
    }

    @Test
    void testEmptyList() {
        assertNull(reorderList.reorderList(null));
    }

    @Test
    void testSingleElementList() {
        ListNode head = buildList(1);
        reorderList.reorderList(head);
        assertListEquals(head, 1);
    }

    @Test
    void testTwoElementList() {
        ListNode head = buildList(1, 2);
        reorderList.reorderList(head);
        assertListEquals(head, 1, 2);
    }

    @Test
    void testThreeElementList() {
        ListNode head = buildList(1, 2, 3);
        reorderList.reorderList(head);
        assertListEquals(head, 1, 3, 2);
    }

    @Test
    void testFourElementList() {
        ListNode head = buildList(1, 2, 3, 4);
        reorderList.reorderList(head);
        assertListEquals(head, 1, 4, 2, 3);
    }

    @Test
    void testOddNumberOfElements() {
        ListNode head = buildList(1, 2, 3, 4, 5);
        reorderList.reorderList(head);
        assertListEquals(head, 1, 5, 2, 4, 3);
    }

    @Test
    void testEvenNumberOfElements() {
        ListNode head = buildList(1, 2, 3, 4, 5, 6);
        reorderList.reorderList(head);
        assertListEquals(head, 1, 6, 2, 5, 3, 4);
    }
}