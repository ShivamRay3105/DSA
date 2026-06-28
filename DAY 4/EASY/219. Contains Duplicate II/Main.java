import java.util.*;

class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (!set.contains(nums[right])) {
                set.add(nums[right]);
            } else {
                while (left < right) {
                    if (nums[left] == nums[right] && Math.abs(left - right) <= k) {
                        return true;
                    }
                    if (right < nums.length - 1 && nums[left] == nums[right + 1])
                        break;
                    left++;
                }

            }
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Test Case 1
        int[] nums1 = { 1, 2, 3, 1 };
        int k1 = 3;
        System.out.println("Test Case 1: " + sol.containsNearbyDuplicate(nums1, k1));
        // Expected: true

        // Test Case 2
        int[] nums2 = { 1, 0, 1, 1 };
        int k2 = 1;
        System.out.println("Test Case 2: " + sol.containsNearbyDuplicate(nums2, k2));
        // Expected: true

        // Test Case 3
        int[] nums3 = { 1, 2, 3, 1, 2, 3 };
        int k3 = 2;
        System.out.println("Test Case 3: " + sol.containsNearbyDuplicate(nums3, k3));
        // Expected: false
    }
}