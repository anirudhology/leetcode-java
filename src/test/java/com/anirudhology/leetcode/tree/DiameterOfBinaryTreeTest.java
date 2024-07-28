package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterOfBinaryTreeTest {

    @Test
    public void testDiameterOfBinaryTree() {
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

        // Test case 1: Empty tree
        assertEquals(0, diameterOfBinaryTree.diameterOfBinaryTree(null));

        // Test case 2: Single node tree
        TreeNode root1 = new TreeNode(1);
        diameterOfBinaryTree = new DiameterOfBinaryTree();
        assertEquals(0, diameterOfBinaryTree.diameterOfBinaryTree(root1));

        // Test case 3: Two-level tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        diameterOfBinaryTree = new DiameterOfBinaryTree();
        assertEquals(1, diameterOfBinaryTree.diameterOfBinaryTree(root2));

        // Test case 4: Full binary tree
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);
        root3.left.right = new TreeNode(5);
        diameterOfBinaryTree = new DiameterOfBinaryTree();
        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(root3));

        // Test case 5: Larger tree
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.right.right = new TreeNode(6);
        root4.left.left.left = new TreeNode(7);
        diameterOfBinaryTree = new DiameterOfBinaryTree();
        assertEquals(5, diameterOfBinaryTree.diameterOfBinaryTree(root4));
    }
}