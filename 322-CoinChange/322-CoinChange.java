// Last updated: 02/01/2026, 10:09:35
class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount + 1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        int ans = dprog(coins.length-1,amount,dp,coins);
        if(ans>=99999){
            ans=-1;
        }
        return ans;
    }

    int dprog(int index,int target,int dp[][],int coins[]){
        if(index==0){
            if(target%coins[0]==0){
                return target/coins[0];
            }
            else{
                return 99999;
            }
        }
        if(dp[index][target]!=-1){
                return dp[index][target];
            }
            int notTake=0+dprog(index-1,target,dp,coins);
            int take=99999;
            if(coins[index]<=target){
                take=1+dprog(index,target-coins[index],dp,coins);
            }
            return dp[index][target]=Math.min(take,notTake);
    }
}