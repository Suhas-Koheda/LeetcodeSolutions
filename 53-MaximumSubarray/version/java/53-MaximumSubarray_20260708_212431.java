// Last updated: 08/07/2026, 21:24:31
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum=0;
4        int max=-9999999;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            max=Math.max(max,sum);
8            if(sum<0)sum=0;
9        }
10        return max;
11    }
12}