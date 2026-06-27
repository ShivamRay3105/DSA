import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        // a b c a b c b b

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

public class Main {

    static void runTest(String s, int expected) {
        Solution sol = new Solution();
        int actual = sol.lengthOfLongestSubstring(s);

        if (actual == expected) {
            System.out.println("✅ PASS");
        } else {
            System.out.println("❌ FAIL");
            System.out.println("Input    : \"" + s + "\"");
            System.out.println("Expected : " + expected);
            System.out.println("Got      : " + actual);
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // Official LeetCode Test Cases
        runTest("abcabcbb", 3);

        runTest("bbbbb", 1);

        runTest("pwwkew", 3);

        // Additional Useful Test Cases
        runTest("", 0);

        runTest("a", 1);

        runTest("au", 2);

        runTest("dvdf", 3);

        runTest("abba", 2);

        runTest("tmmzuxt", 5);
    }
}