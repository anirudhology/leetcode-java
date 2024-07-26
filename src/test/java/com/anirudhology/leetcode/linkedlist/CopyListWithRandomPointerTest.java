package com.anirudhology.leetcode.linkedlist;

import com.anirudhology.leetcode.util.ListNodeWithRandom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class CopyListWithRandomPointerTest {

    private final CopyListWithRandomPointer copyListWithRandomPointer = new CopyListWithRandomPointer();

    @Test
    public void testCopyRandomList() {
        // Test case 1: Empty list
        assertNull(copyListWithRandomPointer.copyRandomList(null));

        // Test case 2: List with one node and no random pointer
        ListNodeWithRandom node1 = new ListNodeWithRandom(1);
        ListNodeWithRandom copiedNode1 = copyListWithRandomPointer.copyRandomList(node1);
        assertNotNull(copiedNode1);
        assertEquals(1, copiedNode1.val);
        assertNull(copiedNode1.next);
        assertNull(copiedNode1.random);

        // Test case 3: List with one node with random pointer to itself
        node1.random = node1;
        copiedNode1 = copyListWithRandomPointer.copyRandomList(node1);
        assertNotNull(copiedNode1);
        assertEquals(1, copiedNode1.val);
        assertNull(copiedNode1.next);
        assertNotNull(copiedNode1.random);
        assertEquals(copiedNode1, copiedNode1.random);

        // Test case 4: List with multiple nodes and no random pointers
        ListNodeWithRandom node2 = new ListNodeWithRandom(2);
        node1.next = node2;
        ListNodeWithRandom copiedList = copyListWithRandomPointer.copyRandomList(node1);
        assertNotNull(copiedList);
        assertEquals(1, copiedList.val);
        assertNotNull(copiedList.next);
        assertEquals(2, copiedList.next.val);
        assertNotNull(copiedList.random);
        assertNull(copiedList.next.random);

        // Test case 5: List with multiple nodes and random pointers
        ListNodeWithRandom node3 = new ListNodeWithRandom(3);
        node2.next = node3;
        node1.random = node3;
        node2.random = node1;
        node3.random = node2;
        copiedList = copyListWithRandomPointer.copyRandomList(node1);
        assertNotNull(copiedList);
        assertEquals(1, copiedList.val);
        assertNotNull(copiedList.next);
        assertEquals(2, copiedList.next.val);
        assertNotNull(copiedList.next.next);
        assertEquals(3, copiedList.next.next.val);
        assertNull(copiedList.next.next.next);

        assertEquals(copiedList.next.next, copiedList.random);
        assertEquals(copiedList, copiedList.next.random);
        assertEquals(copiedList.next, copiedList.next.next.random);
    }
}