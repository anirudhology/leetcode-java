package com.anirudhology.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        // List to store all the combinations
        final List<String> combinations = new ArrayList<>();
        // Special case
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        // Map for all the digits
        final String[] mappings = new String[]{
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        // Perform backtracking
        backtrack(digits, 0, new StringBuilder(), mappings, combinations);
        return combinations;
    }

    private void backtrack(String digits, int index, StringBuilder combination, String[] mappings, List<String> combinations) {
        // Base case
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }
        // Get letters corresponding to the given index
        String letters = mappings[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            backtrack(digits, index + 1, combination.append(letter), mappings, combinations);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
