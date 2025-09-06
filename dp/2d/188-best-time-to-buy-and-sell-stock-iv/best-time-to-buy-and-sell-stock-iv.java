class Solution {
    public int maxProfit(int k, int[] prices) {
        int dp[][][]=new int[prices.length][2][k+1];
        for(int i[][]:dp){
            for(int j[]:i){
                Arrays.fill(j,-1);
            }
        }
        return check(0,1,k,prices,dp);
    }
    int check(int i,int b,int c,int prices[],int dp[][][]){
        if(i==prices.length){
            return 0;
        }
        if(c==0)return 0;
        if(dp[i][b][c]!=-1) return dp[i][b][c];
        int buy=0;
        if(b==1){
            buy=Math.max(-prices[i]+check(i+1,0,c,prices,dp),check(i+1,1,c,prices,dp));
        }
        else{
            buy=Math.max(prices[i]+check(i+1,1,c-1,prices,dp),check(i+1,0,c,prices,dp));
        }
        return dp[i][b][c]=buy;
    }
}