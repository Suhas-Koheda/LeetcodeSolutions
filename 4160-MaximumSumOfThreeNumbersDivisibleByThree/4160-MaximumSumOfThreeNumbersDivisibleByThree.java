// Last updated: 02/01/2026, 10:06:23
class Solution {
    public int maximumSum(int[] nums) {
        long dp[][]=new long[4][3];
        for(long row[]:dp)Arrays.fill(row,-1);
        dp[0][0]=0;
        for(int x:nums){
            int remX=x%3;
            for(int count=3;count>=1;count--){
                for(int current=0;current<3;current++){
                    int prev=(current-remX%3+3)%3;
                    if (dp[count - 1][prev] != -1) {
                        dp[count][current] = Math.max(
                            dp[count][current], 
                            dp[count - 1][prev] + x
                        );
                    }
                }
            }
        }
        return dp[3][0]==-1?0:(int)dp[3][0];
    }
}