class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid;
                right = mid;
                while (left > -1 && nums[left] == target)
                    left--;
                result[0] = left + 1;
                while (right < nums.length && nums[right] == target)
                    right++;
                result[1] = right - 1;
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;

        // first apply binary search to find the target value
        // then traverse left and right to find the first and last position of the target value
    }
}