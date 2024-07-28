package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    public void testMaxDepth() {
        // Test case 1: Empty tree
        assertEquals(0, maximumDepthOfBinaryTree.maxDepth(null));

        // Test case 2: Single node tree
        TreeNode root1 = new TreeNode(1);
        assertEquals(1, maximumDepthOfBinaryTree.maxDepth(root1));

        // Test case 3: Two-level tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        assertEquals(2, maximumDepthOfBinaryTree.maxDepth(root2));

        // Test case 4: Full binary tree
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);
        root3.left.right = new TreeNode(5);
        root3.right.left = new TreeNode(6);
        root3.right.right = new TreeNode(7);
        assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root3));
    }
}