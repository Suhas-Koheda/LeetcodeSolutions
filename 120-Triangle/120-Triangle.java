// Last updated: 02/01/2026, 10:10:06
class Solution {
    public int minimumTotal(List<List<Integer>> grid) {
        int n=grid.size();
        int dp[][]=new int[n][n];
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            dp[n-1][j]=grid.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int up=dp[i+1][j]+grid.get(i).get(j);
                int left=dp[i+1][j+1]+grid.get(i).get(j);
                dp[i][j] = Math.min(up,left);
            }
        }

        return dp[0][0];
    }
}