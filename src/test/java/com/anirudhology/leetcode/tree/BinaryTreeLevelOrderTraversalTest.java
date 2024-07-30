package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
    
    @Test
    public void testLevelOrder() {
        // Test case 1: Empty tree
        List<List<Integer>> result1 = binaryTreeLevelOrderTraversal.levelOrder(null);
        assertTrue(result1.isEmpty());

        // Test case 2: Single node tree
        TreeNode root2 = new TreeNode(1);
        List<List<Integer>> expected2 = List.of(List.of(1));
        List<List<Integer>> result2 = binaryTreeLevelOrderTraversal.levelOrder(root2);
        assertEquals(expected2, result2);

        // Test case 3: Tree with two levels
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        List<List<Integer>> expected3 = Arrays.asList(List.of(1), List.of(2, 3));
        List<List<Integer>> result3 = binaryTreeLevelOrderTraversal.levelOrder(root3);
        assertEquals(expected3, result3);

        // Test case 4: Tree with three levels
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.right.left = new TreeNode(6);
        root4.right.right = new TreeNode(7);
        List<List<Integer>> expected4 = List.of(
                List.of(1),
                List.of(2, 3),
                List.of(4, 5, 6, 7)
        );
        List<List<Integer>> result4 = binaryTreeLevelOrderTraversal.levelOrder(root4);
        assertEquals(expected4, result4);
    }
}