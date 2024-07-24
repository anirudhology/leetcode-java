package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Move fast node n steps ahead
        while (n > 0 && fast != null) {
            fast = fast.next;
            n--;
        }
        // Check if fast is null, it means our n >= number of nodes
        if (fast == null && head != null) {
            return head.next;
        }
        // Now, move both nodes together with the same pace
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Remove the node in between
        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
}
