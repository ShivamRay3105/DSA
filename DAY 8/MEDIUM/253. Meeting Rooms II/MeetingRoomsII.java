import java.util.Arrays;

public class MeetingRoomsII {

        public static int minMeetingRooms(int[][] intervals) {
                Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
                int maxRooms = 1;

                for (int i = 1; i < intervals.length; i++) {
                        if (intervals[i][0] >= intervals[i - 1][1] ) {
                                continue;
                        }else {
                                maxRooms++;
                        }
                }

                return maxRooms;
        }

        public static void main(String[] args) {

                // Test Case 1: Overlapping meetings
                int[][] test1 = {
                                { 0, 30 },
                                { 5, 10 },
                                { 15, 20 }
                };

                // Test Case 2: No overlapping meetings
                int[][] test2 = {
                                { 7, 10 },
                                { 12, 15 }
                };

                // Test Case 3: Meetings touching at boundaries
                int[][] test3 = {
                                { 1, 5 },
                                { 5, 8 },
                                { 8, 10 }
                };

                // Test Case 4: All meetings overlap
                int[][] test4 = {
                                { 1, 10 },
                                { 2, 9 },
                                { 3, 8 },
                                { 4, 7 }
                };

                // Test Case 5: Unsorted input with mixed overlaps
                int[][] test5 = {
                                { 10, 20 },
                                { 2, 7 },
                                { 5, 12 },
                                { 15, 18 },
                                { 25, 30 }
                };

                System.out.println("Test Case 1: " + minMeetingRooms(test1)); // Expected: 2
                System.out.println("Test Case 2: " + minMeetingRooms(test2)); // Expected: 1
                System.out.println("Test Case 3: " + minMeetingRooms(test3)); // Expected: 1
                System.out.println("Test Case 4: " + minMeetingRooms(test4)); // Expected: 4
                System.out.println("Test Case 5: " + minMeetingRooms(test5)); // Expected: 2
        }
}