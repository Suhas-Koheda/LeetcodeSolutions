// Last updated: 02/01/2026, 10:07:05
class Solution {
    int rows;
    int cols;
    public int findMaxFish(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int maxFishes=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0){
                    maxFishes=Math.max(maxFishes, dfs(i,j,grid));
                }
            }
        }
        return maxFishes;
    }
    public int dfs(int r, int c, int grid[][]){
        if(r<0 || r>=rows || c<0 || c>= cols || grid[r][c] == 0){
            return 0;
        }
        int ans = grid[r][c];
        grid[r][c] = 0;
        ans += dfs(r-1,c,grid) + dfs(r,c+1,grid) + dfs(r+1,c,grid) + dfs(r,c-1,grid);
        return ans;
    }
}