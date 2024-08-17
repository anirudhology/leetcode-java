package com.anirudhology.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeetingRoomsTest {

    private final MeetingRooms meetingRooms = new MeetingRooms();

    @Test
    void testCanAttendAllMeetings() {
        // Test case: No overlapping intervals
        int[][] intervals1 = {{0, 30}, {35, 50}, {60, 75}};
        assertTrue(meetingRooms.canAttendMeetings(intervals1));

        // Test case: Overlapping intervals
        int[][] intervals2 = {{0, 30}, {20, 50}, {60, 75}};
        assertFalse(meetingRooms.canAttendMeetings(intervals2));

        // Test case: Empty array
        int[][] intervals3 = {};
        assertTrue(meetingRooms.canAttendMeetings(intervals3));

        // Test case: Single interval
        int[][] intervals4 = {{10, 20}};
        assertTrue(meetingRooms.canAttendMeetings(intervals4));

        // Test case: Continuous but non-overlapping intervals
        int[][] intervals5 = {{0, 10}, {10, 20}, {20, 30}};
        assertTrue(meetingRooms.canAttendMeetings(intervals5));
    }
}