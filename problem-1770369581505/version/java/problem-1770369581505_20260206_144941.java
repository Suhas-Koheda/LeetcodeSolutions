// Last updated: 06/02/2026, 14:49:41
1class Solution {
2    public int finalElement(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return nums[0];
5        return Math.max(nums[0], nums[n - 1]);
6    }
7}