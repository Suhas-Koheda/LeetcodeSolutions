class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length][amount + 1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        int ans = dprog(coins.length-1,amount,dp,coins);
        return ans;
    }
    int dprog(int index,int target,int dp[][],int coins[]){
        if(index==0){
            if(target%coins[0]==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[index][target]!=-1){
                return dp[index][target];
            }
            int notTake=0+dprog(index-1,target,dp,coins);
            int take=0;
            if(coins[index]<=target){
                take=dprog(index,target-coins[index],dp,coins);
            }
            return dp[index][target]=take+notTake;
    }
}