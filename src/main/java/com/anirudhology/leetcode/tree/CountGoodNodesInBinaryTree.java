package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

public class CountGoodNodesInBinaryTree {

    private int count = 0;

    public int goodNodes(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        dfs(root, root.val);
        return count;
    }

    private void dfs(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        // Perform preorder traversal
        if (root.val >= max) {
            count++;
            max = root.val;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }
}
