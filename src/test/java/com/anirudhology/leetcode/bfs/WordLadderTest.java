package com.anirudhology.leetcode.bfs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordLadderTest {

    private final WordLadder wordLadder = new WordLadder();

    @Test
    public void testLadderLengthWordExists() {
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        int result = wordLadder.ladderLength("hit", "cog", wordList);
        assertEquals(5, result);
    }

    @Test
    public void testLadderLengthWordDoesNotExist() {
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log");
        int result = wordLadder.ladderLength("hit", "cog", wordList);
        assertEquals(0, result);
    }

    @Test
    public void testLadderLengthBeginWordEqualsEndWord() {
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        int result = wordLadder.ladderLength("hit", "hit", wordList);
        assertEquals(0, result);
    }

    @Test
    public void testLadderLengthEmptyWordList() {
        List<String> wordList = List.of();
        int result = wordLadder.ladderLength("hit", "cog", wordList);
        assertEquals(0, result);
    }
}