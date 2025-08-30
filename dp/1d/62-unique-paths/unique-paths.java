class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return func(m-1,n-1,dp);
    }
    public int func(int row,int col,int dp[][]){
        if(row==0 && col==0){
            return 1;
        }
        if(row<0 || col<0 ){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int up=func(row-1,col,dp);
        int left=func(row,col-1,dp);
        dp[row][col] = up+left;
        return dp[row][col];
    }
}