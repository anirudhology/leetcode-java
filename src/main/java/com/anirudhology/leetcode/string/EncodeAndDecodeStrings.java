package com.anirudhology.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        final StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            String currentEncoded = s.length() + "/" + s;
            encoded.append(currentEncoded);
        }
        return encoded.toString();
    }

    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) != '/') {
                j++;
            }
            int size = Integer.parseInt(s.substring(i, j));
            String word = s.substring(j + 1, j + 1 + size);
            i = j + 1 + size;
            decoded.add(word);
        }
        return decoded;
    }
}
