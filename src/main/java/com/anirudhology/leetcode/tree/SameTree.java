package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // Compare left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
