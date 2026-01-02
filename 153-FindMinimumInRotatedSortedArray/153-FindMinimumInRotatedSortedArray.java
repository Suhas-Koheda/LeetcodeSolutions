// Last updated: 02/01/2026, 10:09:54
class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i:nums) min=Math.min(min,i);
        return min;
    }
}