package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvertBinaryTreeTest {

    private final InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Test
    public void testInvertTree() {
        // Test case 1: Empty tree
        assertNull(invertBinaryTree.invertTree(null));

        // Test case 2: Single node tree
        TreeNode root1 = new TreeNode(1);
        TreeNode result1 = invertBinaryTree.invertTree(root1);
        assertEquals(1, result1.val);
        assertNull(result1.left);
        assertNull(result1.right);

        // Test case 3: Full binary tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        TreeNode invertedRoot2 = invertBinaryTree.invertTree(root2);
        assertEquals(1, invertedRoot2.val);
        assertEquals(3, invertedRoot2.left.val);
        assertEquals(2, invertedRoot2.right.val);
        assertEquals(7, invertedRoot2.left.left.val);
        assertEquals(6, invertedRoot2.left.right.val);
        assertEquals(5, invertedRoot2.right.left.val);
        assertEquals(4, invertedRoot2.right.right.val);
    }
}