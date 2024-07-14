package com.anirudhology.leetcode.util;

public class StackNode {
    public int value;
    public int minValue;
    public StackNode next;

    public StackNode(int value, int minValue, StackNode next) {
        this.value = value;
        this.minValue = minValue;
        this.next = next;
    }
}
