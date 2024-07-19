package com.anirudhology.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {

    static class TimeMap {

        private final Map<String, Node> entries;

        public TimeMap() {
            this.entries = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (!entries.containsKey(key)) {
                entries.put(key, new Node());
            }
            Node node = entries.get(key);
            node.values.add(value);
            node.timestamps.add(timestamp);
        }

        public String get(String key, int timestamp) {
            if (!entries.containsKey(key)) {
                return "";
            }
            // Get timestamps and values
            List<Integer> timestamps = entries.get(key).timestamps;
            List<String> values = entries.get(key).values;
            // Left and right pointers for the binary search
            int left = 0;
            int right = timestamps.size() - 1;
            // Result
            String result = "";
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if (timestamps.get(middle) <= timestamp) {
                    result = values.get(middle);
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            return result;
        }
    }

    static class Node {
        final List<String> values;
        final List<Integer> timestamps;

        Node() {
            this.values = new ArrayList<>();
            this.timestamps = new ArrayList<>();
        }
    }
}
