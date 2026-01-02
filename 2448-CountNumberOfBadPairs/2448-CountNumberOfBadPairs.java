// Last updated: 02/01/2026, 10:07:26
class Solution {
    public long countBadPairs(int[] nums) {
         long n = nums.length;
        long gp=0;
        long totalPairs = n*(n-1)/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
           int val = i - nums[i];
           int prevCount = map.getOrDefault(val,0);
           gp += prevCount;
           map.put(val, map.getOrDefault(val,0)+1);
        }
        return totalPairs - gp;
    }
}