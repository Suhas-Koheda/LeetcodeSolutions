// Last updated: 22/02/2026, 08:18:53
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int first=0,second=0;
4        boolean active=true;
5        for(int i=0;i<nums.length;i++){
6            if((nums[i]&1)==1){
7                active=!active;
8            }
9            if((i%6)==5){
10                active=!active;
11            }
12            
13                if(active) first=first+nums[i];
14                else second=second+nums[i];
15            
16        }
17        return first-second;
18    }
19}