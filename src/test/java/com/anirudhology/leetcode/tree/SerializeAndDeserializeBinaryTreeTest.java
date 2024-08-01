package com.anirudhology.leetcode.tree;

import com.anirudhology.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SerializeAndDeserializeBinaryTreeTest {

    @Test
    void testSerializeAndDeserialize() {
        SerializeAndDeserializeBinaryTree.Codec codec = new SerializeAndDeserializeBinaryTree.Codec();

        // Test case 1: Empty tree
        assertEquals("", codec.serialize(null));
        assertNull(codec.deserialize(""));

        // Test case 2: Single node tree
        TreeNode root2 = new TreeNode(1);
        assertEquals("1 n n ", codec.serialize(root2));
        TreeNode result2 = codec.deserialize("1 n n ");
        assertEquals(1, result2.val);
        assertNull(result2.left);
        assertNull(result2.right);

        // Test case 3: Complete binary tree
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);
        root3.left.right = new TreeNode(5);
        root3.right.left = new TreeNode(6);
        root3.right.right = new TreeNode(7);
        String serialized3 = codec.serialize(root3);
        assertEquals("1 2 3 4 5 6 7 n n n n n n n n ", serialized3);
        TreeNode result3 = codec.deserialize(serialized3);
        assertEquals(1, result3.val);
        assertEquals(2, result3.left.val);
        assertEquals(3, result3.right.val);
        assertEquals(4, result3.left.left.val);
        assertEquals(5, result3.left.right.val);
        assertEquals(6, result3.right.left.val);
        assertEquals(7, result3.right.right.val);

        // Test case 4: Tree with only left children
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.left.left.left = new TreeNode(4);
        String serialized4 = codec.serialize(root4);
        assertEquals("1 2 n 3 n 4 n n n ", serialized4);
        TreeNode result4 = codec.deserialize(serialized4);
        assertEquals(1, result4.val);
        assertEquals(2, result4.left.val);
        assertNull(result4.right);
        assertEquals(3, result4.left.left.val);
        assertNull(result4.left.right);
        assertEquals(4, result4.left.left.left.val);
        assertNull(result4.left.left.right);

        // Test case 5: Tree with only right children
        TreeNode root5 = new TreeNode(1);
        root5.right = new TreeNode(2);
        root5.right.right = new TreeNode(3);
        root5.right.right.right = new TreeNode(4);
        String serialized5 = codec.serialize(root5);
        assertEquals("1 n 2 n 3 n 4 n n ", serialized5);
        TreeNode result5 = codec.deserialize(serialized5);
        assertEquals(1, result5.val);
        assertNull(result5.left);
        assertEquals(2, result5.right.val);
        assertNull(result5.right.left);
        assertEquals(3, result5.right.right.val);
        assertNull(result5.right.right.left);
        assertEquals(4, result5.right.right.right.val);
        assertNull(result5.right.right.right.right);
    }
}