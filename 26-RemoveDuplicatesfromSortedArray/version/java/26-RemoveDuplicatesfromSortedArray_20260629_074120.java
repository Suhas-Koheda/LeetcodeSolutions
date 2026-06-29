// Last updated: 29/06/2026, 07:41:20
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        // int arr=new int[nums.length];
4        int k=1;
5        // nums[k++]=nums[0];
6        for(int i=1;i<nums.length;i++){
7            if(nums[i]==nums[k-1]) continue;
8            else nums[k++]=nums[i];
9        }
10        return k;
11    }
12}