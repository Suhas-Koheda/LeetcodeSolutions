// Last updated: 20/08/2026, 21:25:43
1class Solution {
2    public int maxProduct(int[] nums) {
3        int ans=nums[0];
4        int max=nums[0];
5        int min=nums[0];
6        for(int i=1;i<nums.length;i++){
7            int c=nums[i];
8            if(c<0){
9                int temp=max;
10                max=min;
11                min=temp;
12            }
13            max=Math.max(c,max*c);
14            min=Math.min(c,min*c);
15            ans=Math.max(ans,max);
16        }
17        return ans;
18    }
19}