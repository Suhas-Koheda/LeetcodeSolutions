class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][] = new int[n][m];
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = matrix[i][j] + dp[i - 1][j];
                 int leftDiagonal = Integer.MAX_VALUE;
                if (j - 1 >= 0) {
                    leftDiagonal = matrix[i][j] + dp[i - 1][j - 1];
                }
                
                int rightDiagonal = Integer.MAX_VALUE;
                if (j + 1 < m) {
                    rightDiagonal = matrix[i][j] + dp[i - 1][j + 1];
                }
                dp[i][j] = Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            min = Math.min(min, dp[n - 1][j]);
        }

        return min;
    }
}