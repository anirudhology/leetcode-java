package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // List to store the output
        final List<List<Integer>> output = new ArrayList<>();
        // Special case
        if (root == null) {
            return output;
        }
        // Queue to store the nodes in BFS
        final Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to the queue
        nodes.offer(root);
        // Traverse the entire tree
        while (!nodes.isEmpty()) {
            // Count of nodes at the current level
            int size = nodes.size();
            // List to store nodes at the current level
            final List<Integer> currentLevelNodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // Remove node at the front
                final TreeNode node = nodes.remove();
                currentLevelNodes.add(node.val);
                // Add left and right nodes
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
            // Add current level list to output
            output.add(currentLevelNodes);
        }
        return output;
    }
}
