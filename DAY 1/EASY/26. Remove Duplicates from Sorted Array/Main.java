import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {

        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
                right++;
            } else {
                left++;
                nums[left] = nums[right];
            }
        }

        return left + 1;
    }
}

public class Main {

    private static void runTest(int[] nums) {
        Solution solution = new Solution();

        System.out.println("Input: " + Arrays.toString(nums));

        int k = solution.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Modified Array = [");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        // Test Case 1
        runTest(new int[] { 1, 1, 2 });
        // Expected: k = 2, [1, 2]

        // Test Case 2
        runTest(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
        // Expected: k = 5, [0, 1, 2, 3, 4]

        // Test Case 3
        runTest(new int[] { 1 });
        // Expected: k = 1, [1]

        // Test Case 4
        runTest(new int[] { 1, 1, 1, 1 });
        // Expected: k = 1, [1]

        // Test Case 5
        runTest(new int[] { 1, 2, 3, 4, 5 });
        // Expected: k = 5, [1, 2, 3, 4, 5]
    }
}