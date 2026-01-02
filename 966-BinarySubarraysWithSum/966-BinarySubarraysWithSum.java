// Last updated: 02/01/2026, 10:08:48
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return check(nums,goal)-check(nums,goal-1);
    }

    public int check(int[] arr,int goal){
        if(goal<0) return 0;
        int r=0,l=0,sum=0,count=0;
        while(r<arr.length){
            sum=sum+arr[r];
            while(sum>goal){
                sum-=arr[l];
                l++;
            }
            if(sum<=goal){
                count=count+r-l+1;
            }
            r++;
        }
        return count;
    }
}