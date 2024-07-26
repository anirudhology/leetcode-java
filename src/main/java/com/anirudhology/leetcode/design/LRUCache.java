package com.anirudhology.leetcode.design;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    // Capacity of the cache
    private final int capacity;
    // Size or total number of entries in the cache
    private int size;
    // Mappings between key and entry objects
    private final Map<Integer, Entry<Integer, Integer>> entries;
    // Head of the list
    private Entry<Integer, Integer> head;
    // Tail of the list
    private Entry<Integer, Integer> tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.entries = new HashMap<>();
    }

    public int get(int key) {
        // If key is present in the cache
        if (entries.containsKey(key)) {
            // Get the node corresponding to the key
            Entry<Integer, Integer> entry = entries.get(key);
            // Delete node from its current position and add to head
            deleteEntry(entry);
            updateHead(entry);
            return entry.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        // If key already exists in the cache
        if (entries.containsKey(key)) {
            // Update the value corresponding to this key
            Entry<Integer, Integer> entry = entries.get(key);
            entry.value = value;
            // Delete node from its current position and update the head
            deleteEntry(entry);
            updateHead(entry);
        }
        // If this is a new entry
        else {
            // Create a new node
            Entry<Integer, Integer> entry = new Entry<>(key, value);
            if (size >= capacity) {
                entries.remove(tail.key);
                deleteEntry(tail);
            }
            updateHead(entry);
            entries.put(key, entry);
            size++;
        }
    }

    private void updateHead(Entry<Integer, Integer> entry) {
        // Make entry as the new head
        entry.next = head;
        entry.previous = null;
        // If head is not null
        if (head != null) {
            head.previous = entry;
        }
        // Update the head
        head = entry;
        // If there is only one node
        if (tail == null) {
            tail = entry;
        }
    }

    private void deleteEntry(Entry<Integer, Integer> entry) {
        // If given entry is not the head
        if (entry.previous != null) {
            entry.previous.next = entry.next;
        } else {
            head = entry.next;
        }
        // If given entry is not the tail
        if (entry.next != null) {
            entry.next.previous = entry.previous;
        } else {
            tail = entry.previous;
        }
    }

    static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> previous;
        private Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
