package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthSmallestElementInABSTTest {
    
    @Test
    void testKthSmallestSingleNode() {
        KthSmallestElementInABST kthSmallestElementInABST = new KthSmallestElementInABST();
        TreeNode root = new TreeNode(1);
        assertEquals(1, kthSmallestElementInABST.kthSmallest(root, 1));
    }

    @Test
    void testKthSmallestLeftSkewedTree() {
        KthSmallestElementInABST kthSmallestElementInABST = new KthSmallestElementInABST();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        assertEquals(2, kthSmallestElementInABST.kthSmallest(root, 2));
    }

    @Test
    void testKthSmallestRightSkewedTree() {
        KthSmallestElementInABST kthSmallestElementInABST = new KthSmallestElementInABST();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertEquals(3, kthSmallestElementInABST.kthSmallest(root, 3));
    }

    @Test
    void testKthSmallestBalancedTree() {
        KthSmallestElementInABST kthSmallestElementInABST = new KthSmallestElementInABST();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        assertEquals(3, kthSmallestElementInABST.kthSmallest(root, 3));
    }

    @Test
    void testKthSmallestKGreaterThanNodes() {
        KthSmallestElementInABST kthSmallestElementInABST = new KthSmallestElementInABST();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertEquals(0, kthSmallestElementInABST.kthSmallest(root, 4)); // This assumes we have a condition to handle this gracefully
    }
}