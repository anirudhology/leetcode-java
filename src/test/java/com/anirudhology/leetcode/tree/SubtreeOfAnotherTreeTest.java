package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SubtreeOfAnotherTreeTest {

    private final SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();

    @Test
    public void testIsSubtree() {
        // Test case 1: Both trees are null
        assertFalse(subtreeOfAnotherTree.isSubtree(null, null));

        // Test case 2: One tree is null
        TreeNode root1 = new TreeNode(1);
        assertFalse(subtreeOfAnotherTree.isSubtree(root1, null));
        assertFalse(subtreeOfAnotherTree.isSubtree(null, root1));

        // Test case 3: Both trees have one node with the same value
        TreeNode root2 = new TreeNode(1);
        TreeNode subRoot2 = new TreeNode(1);
        assertTrue(subtreeOfAnotherTree.isSubtree(root2, subRoot2));

        // Test case 4: Subtree with different values
        TreeNode root3 = new TreeNode(1);
        TreeNode subRoot3 = new TreeNode(2);
        assertFalse(subtreeOfAnotherTree.isSubtree(root3, subRoot3));

        // Test case 5: Subtree is an actual subtree
        TreeNode root4 = new TreeNode(3);
        root4.left = new TreeNode(4);
        root4.right = new TreeNode(5);
        root4.left.left = new TreeNode(1);
        root4.left.right = new TreeNode(2);

        TreeNode subRoot4 = new TreeNode(4);
        subRoot4.left = new TreeNode(1);
        subRoot4.right = new TreeNode(2);
        assertTrue(subtreeOfAnotherTree.isSubtree(root4, subRoot4));

        // Test case 6: Subtree is not an actual subtree
        TreeNode subRoot5 = new TreeNode(4);
        subRoot5.left = new TreeNode(1);
        subRoot5.right = new TreeNode(3);
        assertFalse(subtreeOfAnotherTree.isSubtree(root4, subRoot5));
    }
}