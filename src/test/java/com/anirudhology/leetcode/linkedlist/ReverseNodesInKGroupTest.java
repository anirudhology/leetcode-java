package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseNodesInKGroupTest {

    ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();

    @Test
    public void testReverseKGroupNullHead() {
        ListNode result = reverseNodesInKGroup.reverseKGroup(null, 3);
        assertNull(result);
    }

    @Test
    public void testReverseKGroupKLessThanOrEqualToZero() {
        ListNode head = createList(new int[]{1, 2, 3});
        ListNode result = reverseNodesInKGroup.reverseKGroup(head, 0);
        assertListEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testReverseKGroupSingleElement() {
        ListNode head = createList(new int[]{1});
        ListNode result = reverseNodesInKGroup.reverseKGroup(head, 1);
        assertListEquals(new int[]{1}, result);
    }

    @Test
    public void testReverseKGroupKGreaterThanListLength() {
        ListNode head = createList(new int[]{1, 2, 3});
        ListNode result = reverseNodesInKGroup.reverseKGroup(head, 4);
        assertListEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testReverseKGroupKEqualsListLength() {
        ListNode head = createList(new int[]{1, 2, 3});
        ListNode result = reverseNodesInKGroup.reverseKGroup(head, 3);
        assertListEquals(new int[]{3, 2, 1}, result);
    }

    @Test
    public void testReverseKGroupMultipleKGroups() {
        ListNode head = createList(new int[]{1, 2, 3, 4, 5});
        ListNode result = reverseNodesInKGroup.reverseKGroup(head, 2);
        assertListEquals(new int[]{2, 1, 4, 3, 5}, result);
    }

    @Test
    public void testReverseKGroupRemainingNodesLessThanK() {
        ListNode head = createList(new int[]{1, 2, 3, 4, 5});
        ListNode result = reverseNodesInKGroup.reverseKGroup(head, 3);
        assertListEquals(new int[]{3, 2, 1, 4, 5}, result);
    }

    private ListNode createList(int[] values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private void assertListEquals(int[] expected, ListNode head) {
        ListNode current = head;
        for (int value : expected) {
            assertNotNull(current);
            assertEquals(value, current.val);
            current = current.next;
        }
        assertNull(current);
    }
}
