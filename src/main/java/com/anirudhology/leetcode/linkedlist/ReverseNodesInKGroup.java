package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;

public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        // Special case
        if (head == null || k <= 0) {
            return head;
        }
        // Dummy node
        ListNode dummy = new ListNode();
        dummy.next = head;
        // Pointer to traverse the list
        ListNode temp = dummy;
        // Process the list
        while (true) {
            // Current temp
            ListNode currentTemp = temp;
            // Check if there are enough nodes to reverse
            for (int i = 0; i < k && currentTemp != null; i++) {
                currentTemp = currentTemp.next;
            }
            if (currentTemp == null) {
                break;
            }
            // Now, we know that we have k nodes, let's reverse them
            ListNode previous = null;
            ListNode current = temp.next;
            ListNode next;
            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            // Tail of the node
            ListNode tail = temp.next;
            tail.next = current;
            temp.next = previous;
            temp = tail;
        }
        return dummy.next;
    }
}
