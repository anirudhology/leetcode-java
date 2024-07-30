package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeRightSideViewTest {

    private final BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();
    
    @Test
    public void testEmptyTree() {
        assertEquals(List.of(), binaryTreeRightSideView.rightSideView(null));
    }

    @Test
    public void testSingleNodeTree() {
        TreeNode root = new TreeNode(1);
        assertEquals(List.of(1), binaryTreeRightSideView.rightSideView(root));
    }

    @Test
    public void testRightLeaningTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertEquals(List.of(1, 2, 3), binaryTreeRightSideView.rightSideView(root));
    }

    @Test
    public void testLeftLeaningTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        assertEquals(List.of(1, 2, 3), binaryTreeRightSideView.rightSideView(root));
    }

    @Test
    public void testBalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        assertEquals(List.of(1, 3, 6), binaryTreeRightSideView.rightSideView(root));
    }
}