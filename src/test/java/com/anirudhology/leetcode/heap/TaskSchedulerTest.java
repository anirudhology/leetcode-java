package com.anirudhology.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskSchedulerTest {

    private final TaskScheduler taskScheduler = new TaskScheduler();

    @Test
    public void testEmptyTasks() {
        assertEquals(0, taskScheduler.leastInterval(new char[]{}, 2));
    }

    @Test
    public void testNullTasks() {
        assertEquals(0, taskScheduler.leastInterval(null, 2));
    }

    @Test
    public void testSingleTask() {
        assertEquals(1, taskScheduler.leastInterval(new char[]{'A'}, 2));
    }

    @Test
    public void testMultipleTasksWithCooldown() {
        assertEquals(8, taskScheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }

    @Test
    public void testMultipleTasksNoCooldown() {
        assertEquals(6, taskScheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
    }

    @Test
    public void testComplexTaskPattern() {
        assertEquals(9, taskScheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D'}, 2));
    }
}