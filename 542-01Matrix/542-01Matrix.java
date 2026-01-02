// Last updated: 02/01/2026, 10:09:17
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        int dis[][] = new int[n][m];
        int rowDir[] = { -1, 0, 1, 0 };
        int colDir[] = { 0, 1, 0, -1 };
        Queue<Data> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.add(new Data(i, j, 0));
                    vis[i][j] = 1;
                }
            }
        }

        while (!q.isEmpty()) {
            Data d = q.poll();
            dis[d.x][d.y] = d.dis;
            for (int i = 0; i < 4; i++) {
                int nRow = d.x + rowDir[i];
                int nCol = d.y + colDir[i];
                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && mat[nRow][nCol] == 1 && !(vis[nRow][nCol] == 1)) {
                    q.add(new Data(nRow, nCol, d.dis + 1));
                    vis[nRow][nCol] = 1;
                }
            }
        }
        return dis;
    }
}

class Data {
    int x;
    int y;
    int dis;

    public Data(int x, int y, int dis) {
        this.x = x;
        this.y = y;
        this.dis = dis;
    }
}