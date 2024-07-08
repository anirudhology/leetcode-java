package com.anirudhology.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class GroupAnagramsTest {

    private final GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void testEmptyArray() {
        String[] strs = {};
        List<List<String>> expected = new ArrayList<>();
        assertEquals(expected, groupAnagrams.groupAnagrams(strs));
    }

    @Test
    public void testNullArray() {
        List<List<String>> expected = new ArrayList<>();
        assertEquals(expected, groupAnagrams.groupAnagrams(null));
    }

    @Test
    public void testSingleElementArray() {
        String[] strs = {"a"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("a"));
        assertEquals(expected, groupAnagrams.groupAnagrams(strs));
    }

    @Test
    public void testMultipleAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        // Since the order of the groups and the order within the groups can vary,
        // we need to check the contents ignoring the order
        assertTrue(result.contains(Arrays.asList("eat", "tea", "ate")));
        assertTrue(result.contains(Arrays.asList("tan", "nat")));
        assertTrue(result.contains(List.of("bat")));
    }

    @Test
    public void testAllAnagrams() {
        String[] strs = {"abc", "bca", "cab"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("abc", "bca", "cab"));
        assertEquals(expected, groupAnagrams.groupAnagrams(strs));
    }

    @Test
    public void testNoAnagrams() {
        String[] strs = {"abc", "def", "ghi"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        assertTrue(result.contains(List.of("abc")));
        assertTrue(result.contains(List.of("def")));
        assertTrue(result.contains(List.of("ghi")));
    }
}