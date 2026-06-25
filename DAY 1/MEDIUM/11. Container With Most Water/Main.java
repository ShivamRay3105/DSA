import java.util.Arrays;

class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left<right){
            int currentArea = (Math.min(height[left], height[right]) * ( right - left));
            maxArea = Math.max(maxArea, currentArea);
            if(height[left]< height[right]){
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

public class Main {

    private static void runTest(int[] height) {
        Solution solution = new Solution();

        int result = solution.maxArea(height);

        System.out.println("Input: " + Arrays.toString(height));
        System.out.println("Output: " + result);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        // Test Case 1
        runTest(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
        // Expected: 49

        // Test Case 2
        runTest(new int[] { 1, 1 });
        // Expected: 1

        // Test Case 3
        runTest(new int[] { 4, 3, 2, 1, 4 });
        // Expected: 16

        // Test Case 4
        runTest(new int[] { 1, 2, 1 });
        // Expected: 2

        // Test Case 5
        runTest(new int[] { 2, 3, 10, 5, 7, 8, 9 });
        // Expected: 36

        // Test Case 6
        runTest(new int[] { 1, 2, 4, 3 });
        // Expected: 4
    }
}