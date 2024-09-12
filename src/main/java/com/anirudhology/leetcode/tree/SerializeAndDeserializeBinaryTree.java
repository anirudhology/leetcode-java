package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {

    static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            // Base case
            if (root == null) {
                return "";
            }
            // StringBuilder to serialize the tree
            final StringBuilder serialized = new StringBuilder();
            // Perform BFS for the tree
            final Queue<TreeNode> nodes = new LinkedList<>();
            // Add root to the queue
            nodes.offer(root);
            // Process the binary tree
            while (!nodes.isEmpty()) {
                // Get the node at the front
                TreeNode node = nodes.remove();
                if (node == null) {
                    serialized.append("n").append(" ");
                } else {
                    serialized.append(node.val).append(" ");
                    nodes.offer(node.left);
                    nodes.offer(node.right);
                }
            }
            return serialized.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.isEmpty()) {
                return null;
            }
            // Get all the values for the tree to be constructed
            final String[] values = data.split(" ");
            TreeNode root = new TreeNode(Integer.parseInt(values[0]));
            final Queue<TreeNode> nodes = new LinkedList<>();
            nodes.offer(root);
            // Process for all the remaining values
            for (int i = 1; i < values.length; i += 2) {
                TreeNode node = nodes.remove();
                if (node != null) {
                    if (!values[i].equals("n")) {
                        node.left = new TreeNode(Integer.parseInt(values[i]));
                        nodes.offer(node.left);
                    }
                    if (!values[i + 1].equals("n")) {
                        node.right = new TreeNode(Integer.parseInt(values[i + 1]));
                        nodes.offer(node.right);
                    }
                }
            }
            return root;
        }
    }
}
