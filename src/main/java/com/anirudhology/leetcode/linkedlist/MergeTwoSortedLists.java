package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        // Special cases
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        // Head of the merged list
        ListNode head = null;
        if (head1.val < head2.val) {
            head = new ListNode(head1.val);
            head1 = head1.next;
        } else {
            head = new ListNode(head2.val);
            head2 = head2.next;
        }
        // Pointer to traverse the resultant list
        ListNode temp = head;
        // Process both lists together
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                temp.next = new ListNode(head1.val);
                head1 = head1.next;
            } else {
                temp.next = new ListNode(head2.val);
                head2 = head2.next;
            }
            temp = temp.next;
        }
        // Process remaining nodes of first list
        while (head1 != null) {
            temp.next = new ListNode(head1.val);
            head1 = head1.next;
            temp = temp.next;
        }
        // Process remaining nodes of the second list
        while (head2 != null) {
            temp.next = new ListNode(head2.val);
            head2 = head2.next;
            temp = temp.next;
        }
        return head;
    }
}
