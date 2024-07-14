package com.anirudhology.leetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    private MinStack minStack;

    @BeforeEach
    void setUp() {
        minStack = new MinStack();
    }

    @Test
    void testPushAndTop() {
        minStack.push(1);
        assertEquals(1, minStack.top());

        minStack.push(2);
        assertEquals(2, minStack.top());

        minStack.push(-1);
        assertEquals(-1, minStack.top());
    }

    @Test
    void testPop() {
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);

        minStack.pop();
        assertEquals(2, minStack.top());

        minStack.pop();
        assertEquals(1, minStack.top());
    }

    @Test
    void testGetMin() {
        minStack.push(1);
        assertEquals(1, minStack.getMin());

        minStack.push(2);
        assertEquals(1, minStack.getMin());

        minStack.push(-1);
        assertEquals(-1, minStack.getMin());

        minStack.pop();
        assertEquals(1, minStack.getMin());
    }

    @Test
    void testMixedOperations() {
        minStack.push(3);
        minStack.push(5);
        assertEquals(3, minStack.getMin());

        minStack.push(2);
        minStack.push(1);
        assertEquals(1, minStack.getMin());

        minStack.pop();
        assertEquals(2, minStack.getMin());

        minStack.pop();
        assertEquals(3, minStack.getMin());

        minStack.top();
        assertEquals(5, minStack.top());
    }
}