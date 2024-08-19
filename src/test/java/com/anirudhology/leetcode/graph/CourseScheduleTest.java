package com.anirudhology.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseScheduleTest {

    private final CourseSchedule courseSchedule = new CourseSchedule();

    @Test
    public void testCanFinishWithNoPrerequisites() {
        assertTrue(courseSchedule.canFinish(3, new int[][]{}));
    }

    @Test
    public void testCanFinishWithValidPrerequisites() {
        assertTrue(courseSchedule.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    public void testCanFinishWithCycleInPrerequisites() {
        assertFalse(courseSchedule.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    public void testCanFinishWithComplexGraph() {
        assertTrue(courseSchedule.canFinish(4, new int[][]{{1, 0}, {2, 1}, {3, 2}}));
    }

    @Test
    public void testCanFinishWithIsolatedCourses() {
        assertTrue(courseSchedule.canFinish(5, new int[][]{{1, 0}, {3, 2}}));
    }
}