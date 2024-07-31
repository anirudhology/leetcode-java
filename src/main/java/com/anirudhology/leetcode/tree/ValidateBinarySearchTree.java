package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode root, long minValue, long maxValue) {
        // Base case
        if (root == null) {
            return true;
        }
        if (root.val >= maxValue || root.val <= minValue) {
            return false;
        }
        return dfs(root.left, minValue, root.val) && dfs(root.right, root.val, maxValue);
    }
}
