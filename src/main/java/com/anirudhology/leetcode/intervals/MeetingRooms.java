package com.anirudhology.leetcode.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public boolean canAttendMeetings(int[][] intervals) {
        // Sort the array by their start time
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        // Process every interval in the array
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0]) {
                return false;
            }
        }
        return true;
    }
}
