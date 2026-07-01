import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }
        map.put(0, 1);

        int arrayCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(prefixSum[i] - k)) {
                arrayCounter++;
            }
            map.put(prefixSum[i], map.getOrDefault(prefixSum[i], 0) + 1);
        }
        return arrayCounter > 0 ? arrayCounter : -1;
    }
}