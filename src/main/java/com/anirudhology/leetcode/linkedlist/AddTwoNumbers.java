package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Special case
        if (l1 == null || l2 == null) {
            return null;
        }
        // Dummy head
        ListNode dummy = new ListNode(-1);
        // Pointer to traverse the resultant list
        ListNode temp = dummy;
        int carry = 0;
        // Traverse both lists
        while (l1 != null && l2 != null) {
            int sum = carry + l1.val + l2.val;
            carry = sum / 10;
            // Create a new node
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        // For the remaining nodes
        while (l1 != null) {
            int sum = carry + l1.val;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = carry + l2.val;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;
            l2 = l2.next;
        }
        // At this point, if there's a carry remaining, we add it in the
        // form of a new node
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
