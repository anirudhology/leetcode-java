package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SameTreeTest {

    private final SameTree sameTree = new SameTree();

    @Test
    public void testIsSameTree() {
        // Test case 1: Both trees are null
        assertTrue(sameTree.isSameTree(null, null));

        // Test case 2: One tree is null
        TreeNode p1 = new TreeNode(1);
        assertFalse(sameTree.isSameTree(p1, null));
        assertFalse(sameTree.isSameTree(null, p1));

        // Test case 3: Both trees have one node with the same value
        TreeNode p2 = new TreeNode(1);
        TreeNode q2 = new TreeNode(1);
        assertTrue(sameTree.isSameTree(p2, q2));

        // Test case 4: Both trees have one node with different values
        TreeNode p3 = new TreeNode(1);
        TreeNode q3 = new TreeNode(2);
        assertFalse(sameTree.isSameTree(p3, q3));

        // Test case 5: Both trees have multiple nodes with the same structure and values
        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        p4.right = new TreeNode(3);
        TreeNode q4 = new TreeNode(1);
        q4.left = new TreeNode(2);
        q4.right = new TreeNode(3);
        assertTrue(sameTree.isSameTree(p4, q4));

        // Test case 6: Both trees have multiple nodes with different structures
        TreeNode p5 = new TreeNode(1);
        p5.left = new TreeNode(2);
        TreeNode q5 = new TreeNode(1);
        q5.right = new TreeNode(2);
        assertFalse(sameTree.isSameTree(p5, q5));
    }
}