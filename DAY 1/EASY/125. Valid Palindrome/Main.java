class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class Main {

    private static void runTest(String s) {
        Solution solution = new Solution();

        boolean result = solution.isPalindrome(s);

        System.out.println("Input: \"" + s + "\"");
        System.out.println("Output: " + result);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        // Test Case 1
        runTest("A man, a plan, a canal: Panama");
        // Expected: true

        // Test Case 2
        runTest("race a car");
        // Expected: false

        // Test Case 3
        runTest(" ");
        // Expected: true

        // Test Case 4
        runTest("madam");
        // Expected: true

        // Test Case 5
        runTest("0P");
        // Expected: false

        // Test Case 6
        runTest("Able was I ere I saw Elba");
        // Expected: true

        // Test Case 7
        runTest("No lemon, no melon");
        // Expected: true
    }
}