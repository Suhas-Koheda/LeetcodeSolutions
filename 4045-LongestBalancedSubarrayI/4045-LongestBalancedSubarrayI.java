// Last updated: 02/01/2026, 10:06:31
class Solution {
    public int longestBalanced(int[] nums) {
        int max = 0;
        int n = nums.length;
        
        for (int l = 0; l < n; l++) {
            Set<Integer> even = new HashSet<>();
            Set<Integer> odd = new HashSet<>();
            
            for (int r = l; r < n; r++) {
                if (nums[r] % 2 == 0) {
                    even.add(nums[r]);
                } else {
                    odd.add(nums[r]);
                }
                
                if (even.size() == odd.size()) {
                    max = Math.max(max, r - l + 1);
                }
            }
        }
        return max;
    }
}