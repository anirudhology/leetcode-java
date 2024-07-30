package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        // List to store the nodes visible from right side
        final List<Integer> rightNodes = new ArrayList<>();
        // Special case
        if (root == null) {
            return rightNodes;
        }
        // Queue to perform BFS
        final Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to the queue
        nodes.offer(root);
        // Process all nodes in the tree
        while (!nodes.isEmpty()) {
            // Get nodes at the current level
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                // Get the current node
                TreeNode node = nodes.remove();
                if (i == size - 1) {
                    rightNodes.add(node.val);
                }
                // Add left and right children, if present
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
        }
        return rightNodes;
    }
}
