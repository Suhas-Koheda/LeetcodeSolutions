class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            int j=0;
            while(j<grid[0].length && grid[i][j]>=0){
                j++;
            }
            count+=(grid[0].length-j);
        }
        return count;
    }
}