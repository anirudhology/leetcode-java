package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CourseScheduleIITest {

    private final CourseScheduleII courseScheduleII = new CourseScheduleII();

    @Test
    public void testFindOrderWithNoPrerequisites() {
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, courseScheduleII.findOrder(3, new int[][]{}));
    }

    @Test
    public void testFindOrderWithValidPrerequisites() {
        int[] expected = {0, 1};
        assertArrayEquals(expected, courseScheduleII.findOrder(2, new int[][]{{1, 0}}));
    }

    @Test
    public void testFindOrderWithCycleInPrerequisites() {
        int[] expected = {};
        assertArrayEquals(expected, courseScheduleII.findOrder(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    public void testFindOrderWithComplexGraph() {
        int[] expected = {0, 1, 2, 3};
        assertArrayEquals(expected, courseScheduleII.findOrder(4, new int[][]{{1, 0}, {2, 1}, {3, 2}}));
    }

    @Test
    public void testFindOrderWithIsolatedCourses() {
        int[] expected = {0, 2, 4, 1, 3};
        assertArrayEquals(expected, courseScheduleII.findOrder(5, new int[][]{{1, 0}, {3, 2}}));
    }
}