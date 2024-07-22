package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        // Special case
        if (head == null || head.next == null) {
            return head;
        }
        // Three pointers w.r.t. current node
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        // Traverse through the given list
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
