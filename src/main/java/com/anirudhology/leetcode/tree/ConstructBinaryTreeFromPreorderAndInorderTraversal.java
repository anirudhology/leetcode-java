package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Map to store the indices of elements in the inorder array
        final Map<Integer, Integer> indexMappings = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMappings.put(inorder[i], i);
        }
        // Perform DFS traversal on the tree
        return helper(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder, indexMappings);
    }

    private TreeNode helper(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, int[] inorder,
                            Map<Integer, Integer> indexMappings) {
        // Base case
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        // Create root of the tree
        final TreeNode root = new TreeNode(preorder[preStart]);
        // Find the index of value at root in the mappings
        int index = indexMappings.get(root.val);
        // Now, all the nodes to the left of the index in inorder array will be
        // present in the left subtree of root and all the elements to the right
        // will be present in the right subtree of root
        root.left = helper(preStart + 1, preEnd, inStart, index - 1, preorder, inorder, indexMappings);
        root.right = helper(preStart + index - inStart + 1, preEnd, index + 1, inEnd, preorder, inorder, indexMappings);
        return root;
    }
}
