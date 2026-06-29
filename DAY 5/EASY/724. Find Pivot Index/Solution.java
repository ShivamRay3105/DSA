class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixArr = new int[nums.length];
        prefixArr[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixArr[i] = nums[i] + prefixArr[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if ((i == 0) && (prefixArr[nums.length - 1] - prefixArr[i] == 0))
                return 0;
            if (i > 0 && prefixArr[i - 1] == prefixArr[nums.length - 1] - prefixArr[i])
                return i;
        }
        return -1;
    }
}