public record OptimalSolution() {
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        int leftPosition = binarySearch(nums, target, true);
        int rightPosition = binarySearch(nums, target, false);
        result[0] = leftPosition;
        result[1] = rightPosition;
        return result;

    }

    public int binarySearch(int[] nums, int target, boolean leftSide) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (leftSide) {
                    right = mid - 1;
                } else
                    left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}
