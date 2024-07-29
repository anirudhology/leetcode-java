package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBinaryTreeTest {

    private final BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    public void testIsBalanced() {
        // Test case 1: Empty tree
        assertTrue(balancedBinaryTree.isBalanced(null));

        // Test case 2: Single node tree
        TreeNode root1 = new TreeNode(1);
        assertTrue(balancedBinaryTree.isBalanced(root1));

        // Test case 3: Balanced tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        assertTrue(balancedBinaryTree.isBalanced(root2));

        // Test case 4: Unbalanced tree
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.left.left = new TreeNode(3);
        assertFalse(balancedBinaryTree.isBalanced(root3));

        // Test case 5: Larger balanced tree
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.right.left = new TreeNode(6);
        root4.right.right = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalanced(root4));
    }
}