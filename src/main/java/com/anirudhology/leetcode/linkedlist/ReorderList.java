package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;

public class ReorderList {

    public ListNode reorderList(ListNode head) {
        // Special case
        if (head == null || head.next == null) {
            return head;
        }
        // Find the middle of the list
        ListNode middle = getMiddle(head);
        // Divide the list in two halves
        ListNode head1 = head;
        ListNode head2 = middle.next;
        // De link both lists
        middle.next = null;
        // Reverse the second list
        ListNode reverseHead2 = reverse(head2);
        // Now merge two lists
        while (head1 != null && reverseHead2 != null) {
            ListNode next1 = head1.next;
            ListNode next2 = reverseHead2.next;
            head1.next = reverseHead2;
            reverseHead2.next = next1;
            head1 = next1;
            reverseHead2 = next2;
        }
        return head;
    }

    private ListNode getMiddle(ListNode head) {
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Process the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        // Pointers
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        // Process the list
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
