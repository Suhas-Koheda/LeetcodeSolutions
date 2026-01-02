// Last updated: 02/01/2026, 10:09:36
class Solution {
    public int maxProfit(int[] prices) {
         int dp[][]=new int[prices.length][2];
        for(int i[]:dp)Arrays.fill(i,-1);
        return check(0,1,prices,dp);
    }
     int check(int i,int b,int prices[],int dp[][]){
        if(i>=prices.length){
            return 0;
        }
        if(dp[i][b]!=-1) return dp[i][b];
        int buy=0;
        if(b==1){
            buy=Math.max(-prices[i]+check(i+1,0,prices,dp),check(i+1,1,prices,dp));
        }
        else{
            buy=Math.max(prices[i]+check(i+2,1,prices,dp),check(i+1,0,prices,dp));
        }
        return dp[i][b]=buy;
    }
}