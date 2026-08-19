// Last updated: 19/08/2026, 21:24:16
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int bp=-1,i=nums.length-1;
4        while(i>0){
5            if(nums[i]>nums[i-1]){
6                bp=i-1;
7                break;
8            }
9            i--;
10        }
11        if(bp==-1) {reverse(nums,0,nums.length-1);return;}
12        i=nums.length-1;
13        while(nums[i]<=nums[bp]){
14            i--;
15        }
16        int temp=nums[i];
17        nums[i]=nums[bp];
18        nums[bp]=temp;
19        reverse(nums,bp+1,nums.length-1);
20    }
21    void reverse(int nums[],int l,int r){
22        while(l<r){
23            int temp=nums[l];
24            nums[l]=nums[r];
25            nums[r]=temp;
26            l++;
27            r--;
28        }
29    }
30}