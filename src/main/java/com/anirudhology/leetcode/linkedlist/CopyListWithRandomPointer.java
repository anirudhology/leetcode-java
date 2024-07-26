package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNodeWithRandom;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public ListNodeWithRandom copyRandomList(ListNodeWithRandom head) {
        // Special case
        if (head == null) {
            return null;
        }
        // Map to store the mapping of original and cloned nodes
        final Map<ListNodeWithRandom, ListNodeWithRandom> mappings = new HashMap<>();
        // Clone head
        ListNodeWithRandom clone = null;
        // Pointers to traverse through both lists
        ListNodeWithRandom temp = head;
        ListNodeWithRandom cloneTemp = null;
        // Traverse the list
        while (temp != null) {
            // Create a new copy node
            ListNodeWithRandom copy = new ListNodeWithRandom(temp.val);
            if (clone == null) {
                clone = copy;
                cloneTemp = clone;
            } else {
                cloneTemp.next = copy;
                cloneTemp = cloneTemp.next;
            }
            // Create mapping
            mappings.put(temp, cloneTemp);
            temp = temp.next;
        }
        // Reset temp pointers
        temp = head;
        cloneTemp = clone;
        // Again traverse the list
        while (temp != null) {
            if (temp.random != null) {
                cloneTemp.random = mappings.get(temp.random);
            }
            temp = temp.next;
            cloneTemp = cloneTemp.next;
        }
        return clone;
    }
}
