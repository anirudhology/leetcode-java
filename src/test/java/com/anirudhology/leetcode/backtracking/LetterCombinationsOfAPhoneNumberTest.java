package com.anirudhology.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCombinationsOfAPhoneNumberTest {
    
    private final LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void testLetterCombinations() {
        List<String> result1 = letterCombinationsOfAPhoneNumber.letterCombinations("23");
        List<String> expected1 = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected1, result1);

        List<String> result2 = letterCombinationsOfAPhoneNumber.letterCombinations("");
        List<String> expected2 = new ArrayList<>();
        assertEquals(expected2, result2);

        List<String> result3 = letterCombinationsOfAPhoneNumber.letterCombinations("2");
        List<String> expected3 = List.of("a", "b", "c");
        assertEquals(expected3, result3);

        List<String> result4 = letterCombinationsOfAPhoneNumber.letterCombinations("9");
        List<String> expected4 = List.of("w", "x", "y", "z");
        assertEquals(expected4, result4);

        List<String> result5 = letterCombinationsOfAPhoneNumber.letterCombinations("1");
        List<String> expected5 = new ArrayList<>();
        assertEquals(expected5, result5);

        List<String> result6 = letterCombinationsOfAPhoneNumber.letterCombinations("10");
        List<String> expected6 = new ArrayList<>();
        assertEquals(expected6, result6);
    }
}