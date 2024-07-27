package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNode;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        // Special case
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeLists(ListNode[] lists, int left, int right) {
        // Boundary condition
        if (left >= right) {
            return lists[left];
        }
        // Middle index
        int middle = left + (right - left) / 2;
        // Recurse for left and right halves
        ListNode leftHalf = mergeLists(lists, left, middle);
        ListNode rightHalf = mergeLists(lists, middle + 1, right);
        // Merge left and right halves
        return merge(leftHalf, rightHalf);
    }

    private ListNode merge(ListNode left, ListNode right) {
        // Dummy head
        ListNode dummy = new ListNode();
        // Reference of the head
        ListNode temp = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        // Process remaining nodes
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}
