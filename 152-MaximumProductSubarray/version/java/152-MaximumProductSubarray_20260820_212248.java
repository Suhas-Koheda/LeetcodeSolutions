// Last updated: 20/08/2026, 21:22:48
1class Solution {
2    public int maxProduct(int[] nums) {
3        int pre=1,suf=1;
4        int n=nums.length;
5        int ans=Integer.MIN_VALUE;
6        for(int i=0;i<n;i++){
7            if(pre==0)pre=1;
8            if(suf==0)suf=1;
9            pre=pre*nums[i];
10            suf=suf*nums[n-i-1];
11            ans=Math.max(ans,Math.max(pre,suf));
12        }
13        return ans;
14    }
15}