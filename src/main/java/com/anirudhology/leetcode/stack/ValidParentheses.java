package com.anirudhology.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public boolean isValid(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Stack to store the left brackets
        final Deque<Character> stack = new ArrayDeque<>();
        // Process the string
        for (char c : s.toCharArray()) {
            // Add left brackets to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // For any of the right brackets
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            // Any other invalid character
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
