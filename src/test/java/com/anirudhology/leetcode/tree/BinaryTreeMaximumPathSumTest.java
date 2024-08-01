package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeMaximumPathSumTest {

    @Test
    void testMaxPathSumSingleNode() {
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        TreeNode root = new TreeNode(1);
        int result = binaryTreeMaximumPathSum.maxPathSum(root);
        assertEquals(1, result);
    }

    @Test
    void testMaxPathSumTwoNodes() {
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int result = binaryTreeMaximumPathSum.maxPathSum(root);
        assertEquals(3, result);
    }

    @Test
    void testMaxPathSumNegativeNodes() {
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int result = binaryTreeMaximumPathSum.maxPathSum(root);
        assertEquals(42, result);
    }

    @Test
    void testMaxPathSumMixedValues() {
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-2);
        int result = binaryTreeMaximumPathSum.maxPathSum(root);
        assertEquals(2, result);
    }

    @Test
    void testMaxPathSumEmptyTree() {
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        int result = binaryTreeMaximumPathSum.maxPathSum(null);
        assertEquals(Integer.MIN_VALUE, result);  // As defined in the maxSum initialization
    }
}