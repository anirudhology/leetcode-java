package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

public class BinaryTreeMaximumPathSum {

    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        // Perform DFS on the tree
        helper(root);
        return maxSum;
    }

    private int helper(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        // Process left and right subtrees
        int leftSum = Math.max(helper(root.left), 0);
        int rightSum = Math.max(helper(root.right), 0);
        // Sum for the current node
        int currentSum = root.val + leftSum + rightSum;
        // Update maxPath, if required
        maxSum = Math.max(maxSum, currentSum);
        // Pick only one of the child from the subtree
        return root.val + Math.max(leftSum, rightSum);
    }
}
