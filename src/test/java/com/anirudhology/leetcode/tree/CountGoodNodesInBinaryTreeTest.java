package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountGoodNodesInBinaryTreeTest {

    private final CountGoodNodesInBinaryTree countGoodNodesInBinaryTree = new CountGoodNodesInBinaryTree();

    @Test
    void testEmptyTree() {
        assertEquals(0, countGoodNodesInBinaryTree.goodNodes(null));
    }

    @Test
    void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, countGoodNodesInBinaryTree.goodNodes(root));
    }

    @Test
    void testRightLeaningTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertEquals(3, countGoodNodesInBinaryTree.goodNodes(root));
    }

    @Test
    void testLeftLeaningTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        assertEquals(1, countGoodNodesInBinaryTree.goodNodes(root));
    }

    @Test
    void testBalancedTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        assertEquals(4, countGoodNodesInBinaryTree.goodNodes(root));
    }
}