class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        return ans(grid);
    }

    int ans(int grid[][]) {
        if (grid.length == 1 && grid[0].length == 1 && grid[0][0]==1)
            return -1;
            if (grid.length == 1 && grid[0].length == 1 && grid[0][0]==0)
            return 1;
        if(grid[0][0]==1)return -1;
        Queue<Dji> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        if(grid[n-1][m-1]==1)return -1;

        int dista[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dista[i][j] =999999;
            }
        }
        dista[0][0] = 1;
        q.add(new Dji(0, 0, 1));
        int dr[] = { -1, 0, 1, 0, 1, -1, 1, -1 };
        int dc[] = { 0, 1, 0, -1, 1, -1, -1, 1 };
        while (!q.isEmpty()) {
            Dji rem = q.poll();
            int x = rem.x;
            int y = rem.y;
            int dist = rem.dist;
            for (int i = 0; i < 8; i++) {
                int newR = x + dr[i];
                int newC = y + dc[i];
                if (newR >= 0 && newR < n && newC >= 0 && newC < m
                        && grid[newR][newC] == 0
                        && dist + 1 < dista[newR][newC]) {
                    dista[newR][newC] = dist + 1;
                    System.out.println(newR+" "+newC+" "+dist);
                if(newR==n-1 && newC==m-1){
                    return dist+1;
                }
                q.add(new Dji(newR,newC,dist+1));
                }
            }
        }
        return -1;
    }
}

class Dji {
    int x;
    int y;
    int dist;

    public Dji(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}