class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] result = new int[intervals.length][2];
        result[0] = intervals[0];
        int end = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= result[end][1]) {
                result[end][1] = Math.max(result[end][1], intervals[i][1]);
            } else {
                end++;
                result[end] = intervals[i];
            }
        }
        return Arrays.copyOfRange(result, 0, end + 1);
    }
}