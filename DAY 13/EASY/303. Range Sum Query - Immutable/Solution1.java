class Solution1 {
    // prefix sum and postfix sum approach

    int[] nums;

    public Solution1(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int[] postSum = new int[nums.length];
        if (left > 0) {
            postSum[nums.length - 1] = nums[nums.length - 1];
            for (int i = nums.length - 2; i > -1; i--) {
                postSum[i] = nums[i] + postSum[i + 1];
            }
            if (right == nums.length - 1)
                return postSum[left];
            // if(right<nums.length-1)
            else
                return (postSum[left] - postSum[right + 1]);

        } else {
            int[] prefixSum = new int[nums.length];
            prefixSum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixSum[i] = nums[i] + prefixSum[i - 1];
            }
            return prefixSum[right];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */