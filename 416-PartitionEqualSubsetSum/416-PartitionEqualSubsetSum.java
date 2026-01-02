// Last updated: 02/01/2026, 10:09:28
class Solution {
    public boolean canPartition(int[] nums) {
       return checker(nums);
    }

    boolean checker(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        int dp[][]=new int[nums.length][(sum/2)+1];
        for (int row[] : dp) Arrays.fill(row, -1);
        return check(nums,sum/2,nums.length-1,dp);
    }
    boolean check(int[] nums,int target,int i,int dp[][]){
        if(target==0) return true;
        if(i==0 ) return nums[i]==target;
        boolean take=false;
        if (dp[i][target] != -1) return dp[i][target] == 0 ? false : true;
        if(target>=nums[i]){
        take=check(nums,target-nums[i],i-1,dp);
        }
        boolean notTake=check(nums,target,i-1,dp);
        dp[i][target] = notTake | take ? 1 : 0;
        return  take | notTake;
    }
}