package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LowestCommonAncestorOfABinarySearchTreeTest {

    private final LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree = new LowestCommonAncestorOfABinarySearchTree();

    @Test
    public void testLowestCommonAncestor() {
        // Test case 1: Both nodes are null
        assertNull(lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(null, null, null));

        // Test case 2: One node is null
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(1);
        assertNull(lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, null, p));
        assertNull(lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, null));

        // Test case 3: Both nodes are the same
        assertEquals(p, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(p, p, p));

        // Test case 4: LCA is root
        TreeNode q = new TreeNode(5);
        root.left = p;
        root.right = q;
        assertEquals(root, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, q));

        // Test case 5: LCA is in the left subtree
        TreeNode p2 = new TreeNode(0);
        p.left = p2;
        assertEquals(p, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p2, p));

        // Test case 6: LCA is in the right subtree
        TreeNode q2 = new TreeNode(6);
        q.right = q2;
        assertEquals(q, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, q, q2));

        // Test case 7: Complex tree
        TreeNode root2 = new TreeNode(6);
        TreeNode p3 = new TreeNode(2);
        TreeNode q3 = new TreeNode(8);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(4);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(5);
        assertEquals(root2, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root2, p3, q3));
    }
}