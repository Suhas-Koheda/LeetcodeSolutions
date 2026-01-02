// Last updated: 02/01/2026, 10:07:45
class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int left = 0;
        int right = cells.length;
        int ans = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (canCross(cells, middle, row, col)) {
                left = middle + 1;
            } else {
                ans=middle;
                right = middle - 1;
            }
        }
        return ans;
    }

    boolean canCross(int cells[][], int middle, int row, int col) {
        int grid[][] = new int[row][col];
        for (int i = 0; i <= middle; i++) {
            grid[cells[i][0] - 1][cells[i][1] - 1] = 1;
        }
        final int[] directions = { -1, 0, 1, 0, -1 };
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < col; i++) {
            if (grid[0][i] == 0) {
                queue.offer(new int[] { 0, i});
                grid[0][i] = 1;
            }
        }
        while(!queue.isEmpty()){
            int position[]=queue.poll();
            int cRow=position[0];
            int cCol=position[1];
            if (cRow == row - 1) {
                return true;
            }
            for(int i=0;i<4;i++){
                int newRow=cRow+directions[i];
                int newCol=cCol+directions[i+1];
                if (newRow >= 0 && newRow < row &&
                    newCol >= 0 && newCol < col &&
                    grid[newRow][newCol] == 0) {
                    queue.offer(new int[] {newRow,newCol});
                    grid[newRow][newCol] = 1;
                }
            }
        }
        return false;
    }
}