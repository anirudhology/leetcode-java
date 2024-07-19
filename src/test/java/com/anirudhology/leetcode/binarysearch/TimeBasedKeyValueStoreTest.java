package com.anirudhology.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeBasedKeyValueStoreTest {

    @Test
    public void testSetAndGet() {
        TimeBasedKeyValueStore.TimeMap timeMap = new TimeBasedKeyValueStore.TimeMap();

        // Basic set and get
        timeMap.set("foo", "bar", 1);
        assertEquals("bar", timeMap.get("foo", 1));

        // Setting multiple values for the same key
        timeMap.set("foo", "bar2", 4);
        assertEquals("bar", timeMap.get("foo", 2));
        assertEquals("bar2", timeMap.get("foo", 4));
        assertEquals("bar2", timeMap.get("foo", 5));
    }

    @Test
    public void testGetNonExistentKey() {
        TimeBasedKeyValueStore.TimeMap timeMap = new TimeBasedKeyValueStore.TimeMap();

        // Getting a value for a non-existent key
        assertEquals("", timeMap.get("nonexistent", 1));
    }

    @Test
    public void testGetForTimestampBeforeAnySet() {
        TimeBasedKeyValueStore.TimeMap timeMap = new TimeBasedKeyValueStore.TimeMap();

        // Setting a value
        timeMap.set("foo", "bar", 5);

        // Getting a value for a timestamp before any value was set
        assertEquals("", timeMap.get("foo", 1));
    }

    @Test
    public void testSetAndGetMultipleKeys() {
        TimeBasedKeyValueStore.TimeMap timeMap = new TimeBasedKeyValueStore.TimeMap();

        // Setting multiple keys
        timeMap.set("foo", "bar", 1);
        timeMap.set("baz", "qux", 2);

        // Getting values for multiple keys
        assertEquals("bar", timeMap.get("foo", 1));
        assertEquals("qux", timeMap.get("baz", 2));
    }

    @Test
    public void testSetAndGetEdgeCases() {
        TimeBasedKeyValueStore.TimeMap timeMap = new TimeBasedKeyValueStore.TimeMap();

        // Setting values at edge timestamps
        timeMap.set("foo", "bar", Integer.MAX_VALUE);
        assertEquals("bar", timeMap.get("foo", Integer.MAX_VALUE));

        timeMap.set("foo", "bar2", Integer.MIN_VALUE);
        assertEquals("", timeMap.get("foo", Integer.MIN_VALUE));
    }

    @Test
    public void testOverwriteValue() {
        TimeBasedKeyValueStore.TimeMap timeMap = new TimeBasedKeyValueStore.TimeMap();

        // Setting and overwriting a value
        timeMap.set("foo", "bar", 1);
        timeMap.set("foo", "bar", 1);
        assertEquals("bar", timeMap.get("foo", 1));
    }

    @Test
    public void testSetAndGetWithCloseTimestamps() {
        TimeBasedKeyValueStore.TimeMap timeMap = new TimeBasedKeyValueStore.TimeMap();

        // Setting values with close timestamps
        timeMap.set("foo", "bar", 1);
        timeMap.set("foo", "bar2", 2);
        timeMap.set("foo", "bar3", 3);

        // Getting values at close timestamps
        assertEquals("bar", timeMap.get("foo", 1));
        assertEquals("bar2", timeMap.get("foo", 2));
        assertEquals("bar3", timeMap.get("foo", 3));
    }
}