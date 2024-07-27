package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        // Special case
        if (root == null) {
            return null;
        }
        // Left and right subtrees
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = invertTree(left);
        root.left = invertTree(right);
        return root;
    }
}
