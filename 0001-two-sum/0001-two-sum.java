import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sv = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sv.containsKey(target - nums[i])) return new int[] { sv.get(target - nums[i]), i };
            sv.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}