// Last updated: 02/01/2026, 10:08:46
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[(i + 1) % n] ||
                nums[i] == nums[(i + 2) % n]) {
                return nums[i];
            }
        }
        return -1;
    }
}
