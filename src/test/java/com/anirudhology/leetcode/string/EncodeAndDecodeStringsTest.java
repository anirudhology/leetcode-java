package com.anirudhology.leetcode.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeStringsTest {

    private EncodeAndDecodeStrings encoderDecoder;

    @BeforeEach
    public void setUp() {
        encoderDecoder = new EncodeAndDecodeStrings();
    }

    @Test
    public void testEncodeEmptyList() {
        List<String> strs = List.of();
        String encoded = encoderDecoder.encode(strs);
        assertEquals("", encoded);
    }

    @Test
    public void testEncodeSingleEmptyString() {
        List<String> strs = List.of("");
        String encoded = encoderDecoder.encode(strs);
        assertEquals("0/", encoded);
    }

    @Test
    public void testEncodeMultipleStrings() {
        List<String> strs = Arrays.asList("hello", "world");
        String encoded = encoderDecoder.encode(strs);
        assertEquals("5/hello5/world", encoded);
    }

    @Test
    public void testEncodeSpecialCharacters() {
        List<String> strs = Arrays.asList("a/b", "c/d", "e/f");
        String encoded = encoderDecoder.encode(strs);
        assertEquals("3/a/b3/c/d3/e/f", encoded);
    }

    @Test
    public void testDecodeEmptyString() {
        String s = "";
        List<String> decoded = encoderDecoder.decode(s);
        assertTrue(decoded.isEmpty());
    }

    @Test
    public void testDecodeSingleEmptyString() {
        String s = "0/";
        List<String> decoded = encoderDecoder.decode(s);
        assertEquals(1, decoded.size());
        assertEquals("", decoded.get(0));
    }

    @Test
    public void testDecodeMultipleStrings() {
        String s = "5/hello5/world";
        List<String> decoded = encoderDecoder.decode(s);
        assertEquals(2, decoded.size());
        assertEquals("hello", decoded.get(0));
        assertEquals("world", decoded.get(1));
    }

    @Test
    public void testDecodeSpecialCharacters() {
        String s = "3/a/b3/c/d3/e/f";
        List<String> decoded = encoderDecoder.decode(s);
        assertEquals(3, decoded.size());
        assertEquals("a/b", decoded.get(0));
        assertEquals("c/d", decoded.get(1));
        assertEquals("e/f", decoded.get(2));
    }

    @Test
    public void testEncodeDecode() {
        List<String> strs = Arrays.asList("hello", "world", "a/b", "c/d", "e/f", "", "123");
        String encoded = encoderDecoder.encode(strs);
        List<String> decoded = encoderDecoder.decode(encoded);
        assertEquals(strs, decoded);
    }
}