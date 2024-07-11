package com.anirudhology.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        // We will use a Hash Set to store the encodings of elements present
        // in the board
        final Set<String> encodings = new HashSet<>();
        // Process the board one cell at a time
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Current number
                char c = board[i][j];
                // Process only filled cells
                if (c != '.') {
                    if (!encodings.add(c + " is present in row: " + i)
                            || !encodings.add(c + " is present in column: " + j)
                            || !encodings.add(c + " is present in block: " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
