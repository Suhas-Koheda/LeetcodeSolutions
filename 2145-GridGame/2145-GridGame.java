// Last updated: 02/01/2026, 10:07:42
class Solution {
    public long gridGame(int[][] grid) {
        long top=0;
        long min=Long.MAX_VALUE;
        long bottom=0;
        for(int i=0;i<grid[0].length;i++){
            top+=grid[0][i];
        }
        for(int i=0;i<grid[0].length;i++){
            top-=grid[0][i];
            min=Math.min(min,Math.max(bottom,top));
            bottom+=grid[1][i];
        }
        return min;
    }
}