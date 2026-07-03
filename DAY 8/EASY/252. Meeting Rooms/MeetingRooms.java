
public class MeetingRooms {

        public static boolean canAttendMeetings(int[][] intervals) {

                for (int i = 0; i < intervals.length-1; i++) {
                        if (intervals[i][1] > intervals[i + 1][0]) {
                                return false;
                        }
                }

                return true;
        }

        public static void main(String[] args) {

                // Test Case 1: Overlapping meetings
                int[][] test1 = {
                                { 0, 30 },
                                { 5, 10 },
                                { 15, 20 }
                };

                // Test Case 2: Non-overlapping meetings
                int[][] test2 = {
                                { 7, 10 },
                                { 12, 15 }
                };

                // Test Case 3: Meetings touching at boundary
                int[][] test3 = {
                                { 1, 5 },
                                { 5, 8 },
                                { 8, 10 }
                };

                // Test Case 4: Single meeting
                int[][] test4 = {
                                { 2, 6 }
                };

                // Test Case 5: Unsorted input with overlap
                int[][] test5 = {
                                { 10, 20 },
                                { 2, 5 },
                                { 4, 8 },
                                { 25, 30 }
                };

                System.out.println("Test Case 1: " + canAttendMeetings(test1)); // Expected: false
                System.out.println("Test Case 2: " + canAttendMeetings(test2)); // Expected: true
                System.out.println("Test Case 3: " + canAttendMeetings(test3)); // Expected: true
                System.out.println("Test Case 4: " + canAttendMeetings(test4)); // Expected: true
                System.out.println("Test Case 5: " + canAttendMeetings(test5)); // Expected: false
        }
}