package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        // Find the heights in bottom up manner
        return dfs(root) != -1;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Height of the left subtree
        int left = dfs(root.left);
        if (left == -1) {
            return -1;
        }
        // Height of the right subtree
        int right = dfs(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
