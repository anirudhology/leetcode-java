package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    private final ConstructBinaryTreeFromPreorderAndInorderTraversal constructBinaryTreeFromPreorderAndInorderTraversal
            = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    void testBuildTree_singleNode() {
        int[] preorder = {1};
        int[] inorder = {1};
        TreeNode root = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
        assertNotNull(root);
        assertEquals(1, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }

    @Test
    void testBuildTree_twoNodes() {
        int[] preorder = {1, 2};
        int[] inorder = {2, 1};
        TreeNode root = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
        assertNotNull(root);
        assertEquals(1, root.val);
        assertNotNull(root.left);
        assertEquals(2, root.left.val);
        assertNull(root.right);
    }

    @Test
    void testBuildTree_balancedTree() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
        assertNotNull(root);
        assertEquals(3, root.val);
        assertNotNull(root.left);
        assertEquals(9, root.left.val);
        assertNotNull(root.right);
        assertEquals(20, root.right.val);
    }

    @Test
    void testBuildTree_emptyTree() {
        int[] preorder = {};
        int[] inorder = {};
        TreeNode root = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
        assertNull(root);
    }

    @Test
    void testBuildTree_unbalancedTree() {
        int[] preorder = {3, 2, 1, 4, 5};
        int[] inorder = {1, 2, 3, 4, 5};
        TreeNode root = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
        assertNotNull(root);
        assertEquals(3, root.val);
        assertNotNull(root.left);
        assertEquals(2, root.left.val);
        assertNotNull(root.left.left);
        assertEquals(1, root.left.left.val);
        assertNotNull(root.right);
        assertEquals(4, root.right.val);
        assertNotNull(root.right.right);
        assertEquals(5, root.right.right.val);
    }
}