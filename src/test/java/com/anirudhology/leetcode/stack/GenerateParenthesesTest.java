package com.anirudhology.leetcode.stack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class GenerateParenthesesTest {

    private final GenerateParentheses generateParentheses = new GenerateParentheses();
    
    @Test
    public void testGenerateParenthesisZero() {
        List<String> result = generateParentheses.generateParenthesis(0);
        assertTrue(result.isEmpty(), "Expected an empty list for n=0");
    }

    @Test
    public void testGenerateParenthesisOne() {
        List<String> result = generateParentheses.generateParenthesis(1);
        assertEquals(1, result.size(), "Expected one combination for n=1");
        assertTrue(result.contains("()"), "Expected combination: ()");
    }

    @Test
    public void testGenerateParenthesisTwo() {
        List<String> result = generateParentheses.generateParenthesis(2);
        assertEquals(2, result.size(), "Expected two combinations for n=2");
        assertTrue(result.contains("(())"), "Expected combination: (())");
        assertTrue(result.contains("()()"), "Expected combination: ()()");
    }

    @Test
    public void testGenerateParenthesisThree() {
        List<String> result = generateParentheses.generateParenthesis(3);
        assertEquals(5, result.size(), "Expected five combinations for n=3");
        assertTrue(result.contains("((()))"), "Expected combination: ((()))");
        assertTrue(result.contains("(()())"), "Expected combination: (()())");
        assertTrue(result.contains("(())()"), "Expected combination: (())()");
        assertTrue(result.contains("()(())"), "Expected combination: ()(())");
        assertTrue(result.contains("()()()"), "Expected combination: ()()()");
    }

    @Test
    public void testGenerateParenthesisFour() {
        List<String> result = generateParentheses.generateParenthesis(4);
        assertEquals(14, result.size(), "Expected fourteen combinations for n=4");
        assertTrue(result.contains("(((())))"), "Expected combination: (((())))");
        assertTrue(result.contains("((()()))"), "Expected combination: ((()()))");
        assertTrue(result.contains("((())())"), "Expected combination: ((())())");
        assertTrue(result.contains("((()))()"), "Expected combination: ((()))()");
        assertTrue(result.contains("(()(()))"), "Expected combination: (()(()))");
        assertTrue(result.contains("(()()())"), "Expected combination: (()()())");
        assertTrue(result.contains("(()())()"), "Expected combination: (()())()");
        assertTrue(result.contains("(())(())"), "Expected combination: (())(())");
        assertTrue(result.contains("(())()()"), "Expected combination: (())()()");
        assertTrue(result.contains("()((()))"), "Expected combination: ()((()))");
        assertTrue(result.contains("()(()())"), "Expected combination: ()(()())");
        assertTrue(result.contains("()(())()"), "Expected combination: ()(())()");
        assertTrue(result.contains("()()(())"), "Expected combination: ()()(())");
        assertTrue(result.contains("()()()()"), "Expected combination: ()()()()");
    }

    @Test
    public void testGenerateParenthesisInvalid() {
        List<String> result = generateParentheses.generateParenthesis(-1);
        assertTrue(result.isEmpty(), "Expected an empty list for n=-1");
    }
}