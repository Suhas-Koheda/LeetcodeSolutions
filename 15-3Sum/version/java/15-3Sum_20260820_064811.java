// Last updated: 20/08/2026, 06:48:11
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> ans=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(i>0 && nums[i]==nums[i-1]) continue;
7            int j=i+1,k=nums.length-1;
8            while(j<k){
9                int sum=nums[i]+nums[j]+nums[k];
10                if (sum<0)j++;
11                else if (sum>0)k--;
12                else {
13                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
14                    j++;k--;
15
16                    while(j<k && nums[j]==nums[j-1])j++;
17                    while(j<k && nums[k]==nums[k+1])k--;
18                }
19            }
20        }
21        return ans;
22    }
23}