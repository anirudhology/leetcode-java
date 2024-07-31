package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

public class KthSmallestElementInABST {

    private int kthSmallestElement;
    private int count;

    public int kthSmallest(TreeNode root, int k) {
        this.count = k;
        findKthSmallestElement(root);
        return this.kthSmallestElement;
    }

    private void findKthSmallestElement(TreeNode root) {
        // Base case
        if (root == null) {
            return;
        }
        // Move towards left of the tree
        if (root.left != null) {
            findKthSmallestElement(root.left);
        }
        this.count--;
        // Check if we have reached k
        if (this.count == 0) {
            this.kthSmallestElement = root.val;
        }
        // If kth smallest element is not found, move towards right
        if (root.right != null) {
            findKthSmallestElement(root.right);
        }
    }
}
