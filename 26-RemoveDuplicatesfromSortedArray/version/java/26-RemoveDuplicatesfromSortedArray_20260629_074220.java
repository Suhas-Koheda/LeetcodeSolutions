// Last updated: 29/06/2026, 07:42:20
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        // int arr=new int[nums.length];
4        int k=1;
5        // nums[k++]=nums[0];
6        for(int i=1;i<nums.length;i++){
7            if(nums[i]!=nums[k-1]) nums[k++]=nums[i];
8        }
9        return k;
10    }
11}