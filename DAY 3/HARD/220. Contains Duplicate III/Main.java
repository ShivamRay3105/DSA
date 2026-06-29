class Main {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (Math.abs(left - right) <= indexDiff) {
                if (Math.abs(nums[left] - nums[right]) <= valueDiff) {
                    return true;
                }

                right++;
            } else
                left++;
        }
        return false;

    }
}