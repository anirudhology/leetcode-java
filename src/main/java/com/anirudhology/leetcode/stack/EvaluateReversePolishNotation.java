package com.anirudhology.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        // Stack to keep track of operands
        final Deque<Integer> operands = new ArrayDeque<>();
        // Process the tokens
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    int x = operands.pop();
                    int y = operands.pop();
                    operands.push(y + x);
                }
                case "-" -> {
                    int x = operands.pop();
                    int y = operands.pop();
                    operands.push(y - x);
                }
                case "*" -> {
                    int x = operands.pop();
                    int y = operands.pop();
                    operands.push(y * x);
                }
                case "/" -> {
                    int x = operands.pop();
                    int y = operands.pop();
                    operands.push(y / x);
                }
                default -> operands.push(Integer.parseInt(token));
            }

        }
        return operands.pop();
    }
}
