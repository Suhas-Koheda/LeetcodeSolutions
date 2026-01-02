// Last updated: 02/01/2026, 10:09:09
class Solution {
    public int maxProfit(int[] prices, int fee) {
         int dp[][]=new int[prices.length][2];
        for(int i[]:dp)Arrays.fill(i,-1);
        return check(0,1,fee,prices,dp);
    }
    int check(int i,int b,int f,int prices[],int dp[][]){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][b]!=-1) return dp[i][b];
        int buy=0;
        if(b==1){
            buy=Math.max(-prices[i]+check(i+1,0,f,prices,dp),check(i+1,1,f,prices,dp));
        }
        else{
            buy=Math.max(prices[i]-f+check(i+1,1,f,prices,dp),check(i+1,0,f,prices,dp));
        }
        return dp[i][b]=buy;
    }
}