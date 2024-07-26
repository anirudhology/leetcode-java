package com.anirudhology.leetcode.design;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LRUCacheTest {

    @Test
    public void testGetAndPut() {
        LRUCache cache = new LRUCache(2);

        // Test cache miss
        assertEquals(-1, cache.get(1));

        // Test cache put and get
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));

        // Test cache update
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));  // 2 should be evicted
        assertEquals(3, cache.get(3));

        // Test cache eviction
        cache.put(4, 4);
        assertEquals(-1, cache.get(1));  // 1 should be evicted
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

    @Test
    public void testLRUOrder() {
        LRUCache cache = new LRUCache(2);

        // Add items
        cache.put(1, 1);
        cache.put(2, 2);

        // Access 1 to make it most recently used
        assertEquals(1, cache.get(1));

        // Add another item, which should evict 2
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));
        assertEquals(1, cache.get(1));
        assertEquals(3, cache.get(3));
    }

    @Test
    public void testUpdateExistingKey() {
        LRUCache cache = new LRUCache(2);

        // Add and update item
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 10);

        // Ensure value is updated
        assertEquals(10, cache.get(1));

        // Add another item, which should evict 2 as 1 was updated recently
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));
        assertEquals(10, cache.get(1));
        assertEquals(3, cache.get(3));
    }

    @Test
    public void testCapacity() {
        LRUCache cache = new LRUCache(1);

        // Add item and ensure it is accessible
        cache.put(1, 1);
        assertEquals(1, cache.get(1));

        // Add another item, which should evict the first one
        cache.put(2, 2);
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }
}
