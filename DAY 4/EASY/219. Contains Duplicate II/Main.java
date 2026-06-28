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
        Scanner sc = new Scanner(System.in);

        Solution sol = new Solution();

        // Input
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Function call
        boolean ans = sol.containsNearbyDuplicate(nums, k);

        // Output
        System.out.println(ans);

        sc.close();
    }
}