// Last updated: 02/01/2026, 10:10:24
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int prev[] = new int[n];
        
        for (int i = 0; i < m; i++) {
            int temp[] = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    temp[j] = grid[i][j];
                } else if (i == 0) {
                    temp[j] = grid[i][j] + temp[j - 1];
                } else if (j == 0) {
                    temp[j] = grid[i][j] + prev[j];
                } else {
                    temp[j] = grid[i][j] + Math.min(prev[j], temp[j - 1]);
                }
            }
            prev = temp;
        }
        
        return prev[n - 1];
    }
}