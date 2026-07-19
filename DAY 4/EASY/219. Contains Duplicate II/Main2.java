import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        while(right<nums.length){

            if(right-left>k){
                set.remove(nums[left]);
                left++;
            }
            if(set.contains(nums[right])) return true;
            set.add(nums[right]);
            right++;

        }
        return false;
    }
}