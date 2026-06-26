// class Solution {

// public boolean isHappy(int n) {

// if (n < 1)
// return false;
// int slow = n;
// int fast = n;
// do {
// slow = slow * slow;
// fast = (fast * fast) * (fast * fast);
// if (slow == 1 || fast == 1)
// return true;
// } while (slow != fast);

// return false;
// }
// }

// public class Main {

// public static void main(String[] args) {

// Solution sol = new Solution();

// // Test Case 1
// System.out.println("Test 1: " + sol.isHappy(19)); // Expected: true

// // Test Case 2
// System.out.println("Test 2: " + sol.isHappy(2)); // Expected: false

// // Test Case 3
// System.out.println("Test 3: " + sol.isHappy(1)); // Expected: true

// // Test Case 4
// System.out.println("Test 4: " + sol.isHappy(7)); // Expected: true

// // Test Case 5
// System.out.println("Test 5: " + sol.isHappy(10)); // Expected: true

// // Test Case 6
// System.out.println("Test 6: " + sol.isHappy(100)); // Expected: true

// // Test Case 7
// System.out.println("Test 7: " + sol.isHappy(1111111)); // Expected: true

// // Test Case 8
// System.out.println("Test 8: " + sol.isHappy(116)); // Expected: false

// // Test Case 9
// System.out.println("Test 9: " + sol.isHappy(999)); // Expected: false

// // Test Case 10
// System.out.println("Test 10: " + sol.isHappy(2147483647)); // Expected: false
// }
// }