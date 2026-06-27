class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int minLength = Integer.MAX_VALUE;
        int left = 0;
        for( int right = 0; right< nums.length; right++){
            int currentSum = nums[left];
            while (currentSum <target        }

        return 0;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Test Case 1
        System.out.println(sol.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        // Expected: 2

        // Test Case 2
        System.out.println(sol.minSubArrayLen(4, new int[]{1,4,4}));
        // Expected: 1

        // Test Case 3
        System.out.println(sol.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
        // Expected: 0

        // Test Case 4
        System.out.println(sol.minSubArrayLen(15, new int[]{1,2,3,4,5}));
        // Expected: 5

        // Test Case 5
        System.out.println(sol.minSubArrayLen(1, new int[]{1}));
        // Expected: 1
    }
}