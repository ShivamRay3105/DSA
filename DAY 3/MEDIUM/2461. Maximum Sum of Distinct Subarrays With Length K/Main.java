import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        // [1,1,1,7,8,9]
        if (nums.length < k) {
            return 0L;
        }
        int start = 0;
        long sum = 0;
        long currentSum = nums[0];
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);

        for (int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end]) || set.size() == k) {
                set.remove(nums[start]);
                currentSum -= nums[start];
                start++;

            }
            currentSum += nums[end];
            set.add(nums[end]);
            if (set.size() == k) {
                sum = Math.max(sum, currentSum);
            }
        }
        return sum;
    }
}

public class Main {

    static void runTest(int[] nums, int k, long expected) {
        Solution sol = new Solution();
        long actual = sol.maximumSubarraySum(nums, k);

        if (actual == expected) {
            System.out.println("✅ PASS");
        } else {
            System.out.println("❌ FAIL");
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + actual);
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Test Case 1
        runTest(
                new int[] { 1, 5, 4, 2, 9, 9, 9 },
                3,
                15);

        // Test Case 2
        runTest(
                new int[] { 4, 4, 4 },
                3,
                0);

        // Add your own test cases below
        runTest(
                new int[] { 1, 1, 1, 7, 8, 9 },
                3,
                24);

    }
}
