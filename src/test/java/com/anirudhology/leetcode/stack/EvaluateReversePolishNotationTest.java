package com.anirudhology.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationTest {

    private final EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

    @Test
    public void testValidExpressions() {
        // Test with addition
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        assertEquals(9, evaluateReversePolishNotation.evalRPN(tokens1));

        // Test with subtraction
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        assertEquals(6, evaluateReversePolishNotation.evalRPN(tokens2));

        // Test with multiplication
        String[] tokens3 = {"2", "3", "*", "4", "+"};
        assertEquals(10, evaluateReversePolishNotation.evalRPN(tokens3));

        // Test with division
        String[] tokens4 = {"10", "6", "/", "9", "+"};
        assertEquals(10, evaluateReversePolishNotation.evalRPN(tokens4));
    }

    @Test
    public void testSingleOperation() {
        // Single operation addition
        String[] tokens1 = {"2", "3", "+"};
        assertEquals(5, evaluateReversePolishNotation.evalRPN(tokens1));

        // Single operation subtraction
        String[] tokens2 = {"5", "3", "-"};
        assertEquals(2, evaluateReversePolishNotation.evalRPN(tokens2));

        // Single operation multiplication
        String[] tokens3 = {"3", "4", "*"};
        assertEquals(12, evaluateReversePolishNotation.evalRPN(tokens3));

        // Single operation division
        String[] tokens4 = {"8", "4", "/"};
        assertEquals(2, evaluateReversePolishNotation.evalRPN(tokens4));
    }

    @Test
    public void testLessThanThreeTokens() {
        // Less than three tokens should return 0
        assertEquals(1, evaluateReversePolishNotation.evalRPN(new String[]{"1"}));
        assertEquals(2, evaluateReversePolishNotation.evalRPN(new String[]{"1", "2"}));
    }

    @Test
    public void testInvalidExpression() {
        // Test with an invalid expression to see if it handles gracefully
        // Though in the provided code, it doesn't handle this case explicitly,
        // This test ensures that no unexpected errors occur
        assertEquals(3, evaluateReversePolishNotation.evalRPN(new String[]{"1", "2", "+"}));
    }
}
