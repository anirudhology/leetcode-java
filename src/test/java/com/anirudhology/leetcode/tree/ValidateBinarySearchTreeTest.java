package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateBinarySearchTreeTest {
    
    private final ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

    @Test
    void testEmptyTree() {
        assertTrue(validateBinarySearchTree.isValidBST(null));
    }

    @Test
    void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);
        assertTrue(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    void testValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertTrue(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    void testInvalidBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        assertFalse(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    void testValidBSTWithNegativeValues() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
        assertTrue(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    void testInvalidBSTWithEqualValues() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        assertFalse(validateBinarySearchTree.isValidBST(root));
    }
}