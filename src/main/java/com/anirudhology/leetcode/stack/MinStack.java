package com.anirudhology.leetcode.stack;

import com.anirudhology.leetcode.util.StackNode;

public class MinStack {

    private StackNode head;

    public MinStack() {

    }

    public void push(int val) {
        // For the very first node
        if (this.head == null) {
            this.head = new StackNode(val, val, null);
        }
        // For subsequent nodes
        else {
            this.head = new StackNode(val, Math.min(val, head.minValue), head);
        }
    }

    public void pop() {
        this.head = this.head.next;
    }

    public int top() {
        return this.head.value;
    }

    public int getMin() {
        return this.head.minValue;
    }
}
