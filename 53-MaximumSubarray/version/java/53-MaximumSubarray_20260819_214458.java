// Last updated: 19/08/2026, 21:44:58
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum=0;
4        int max=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            max=Math.max(max,sum);
8            if(sum<0)sum=0;
9        }
10        return max;
11    }
12}