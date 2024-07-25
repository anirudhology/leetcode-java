package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddTwoNumberTest {
    
    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    private ListNode arrayToList(int[] array) {
        if (array.length == 0) return null;
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return head;
    }

    private int[] listToArray(ListNode head) {
        if (head == null) return new int[0];
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        int[] array = new int[length];
        current = head;
        for (int i = 0; i < length; i++) {
            array[i] = current.val;
            current = current.next;
        }
        return array;
    }

    @Test
    public void testAddTwoNumbersBothListsNull() {
        ListNode result = addTwoNumbers.addTwoNumbers(null, null);
        assertNull(result);
    }

    @Test
    public void testAddTwoNumbersOneListNull() {
        ListNode l1 = arrayToList(new int[]{1, 2, 3});
        ListNode result = addTwoNumbers.addTwoNumbers(l1, null);
        assertNull(result);

        result = addTwoNumbers.addTwoNumbers(null, l1);
        assertNull(result);
    }

    @Test
    public void testAddTwoNumbersSameLength() {
        ListNode l1 = arrayToList(new int[]{2, 4, 3});
        ListNode l2 = arrayToList(new int[]{5, 6, 4});
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{7, 0, 8}, listToArray(result));
    }

    @Test
    public void testAddTwoNumbersDifferentLength() {
        ListNode l1 = arrayToList(new int[]{9, 9});
        ListNode l2 = arrayToList(new int[]{1});
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 0, 1}, listToArray(result));

        l1 = arrayToList(new int[]{1});
        l2 = arrayToList(new int[]{9, 9});
        result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 0, 1}, listToArray(result));
    }

    @Test
    public void testAddTwoNumbersWithCarry() {
        ListNode l1 = arrayToList(new int[]{9, 9, 9});
        ListNode l2 = arrayToList(new int[]{1});
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 0, 0, 1}, listToArray(result));
    }
}