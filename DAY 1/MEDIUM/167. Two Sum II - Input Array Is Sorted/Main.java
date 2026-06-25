import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int index1 = 0;
        int index2 = numbers.length - 1;
        while (index1 < numbers.length && index2 > 0 && index1 <= index2) {

            if (numbers[index1] + numbers[index2] == target) {
                break;
            } else if (numbers[index1] + numbers[index2] < target)
                index1++;
            else if (numbers[index1] + numbers[index2] > target)
                index2--;

        }
        return new int[] { index1 + 1, index2 + 1 };

    }
}

public class Main {

    private static void runTest(int[] numbers, int target) {
        Solution solution = new Solution();

        int[] result = solution.twoSum(numbers, target);

        System.out.println("Input: numbers = " + Arrays.toString(numbers)
                + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result));
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        // Test Case 1
        runTest(new int[] { 2, 7, 11, 15 }, 9);
        // Expected: [1, 2]

        // Test Case 2
        runTest(new int[] { 2, 3, 4 }, 6);
        // Expected: [1, 3]

        // Test Case 3
        runTest(new int[] { -1, 0 }, -1);
        // Expected: [1, 2]

        // Test Case 4
        runTest(new int[] { 1, 2, 3, 4, 4, 9, 56, 90 }, 8);
        // Expected: [4, 5]

        // Test Case 5
        runTest(new int[] { 5, 25, 75 }, 100);
        // Expected: [2, 3]
    }
}