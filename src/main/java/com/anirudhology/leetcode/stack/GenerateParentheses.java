package com.anirudhology.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        // List to store the final output
        final List<String> combinations = new ArrayList<>();
        // Special case
        if (n <= 0) {
            return combinations;
        }
        // Stack to store the combination of parentheses
        final Stack<Character> stack = new Stack<>();
        generate(n, stack, 0, 0, combinations);
        return combinations;
    }

    private void generate(final int n, Stack<Character> stack, int left, int right, List<String> combinations) {
        // Base case
        if (left == right && left == n) {
            final StringBuilder combination = new StringBuilder();
            for (char c : stack) {
                combination.append(c);
            }
            combinations.add(combination.toString());
            return;
        }
        // If we still have room for left parentheses
        if (left < n) {
            stack.push('(');
            generate(n, stack, left + 1, right, combinations);
            stack.pop();
        }
        // Match the right parentheses
        if (right < left) {
            stack.push(')');
            generate(n, stack, left, right + 1, combinations);
            stack.pop();
        }
    }
}
