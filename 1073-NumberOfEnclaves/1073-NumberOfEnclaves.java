// Last updated: 02/01/2026, 10:08:41
class Solution {
    public int numEnclaves(int[][] board) {
          if (board == null || board.length == 0) return 0;

        int m = board.length, n = board[0].length;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 1) dfs(i, 0, board, vis);
            if (board[i][n - 1] == 1) dfs(i, n - 1, board, vis);
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 1) dfs(0, j, board, vis);
            if (board[m - 1][j] == 1) dfs(m - 1, j, board, vis);
        }
        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1 && !vis[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(int x, int y, int[][] board, boolean[][] vis) {
        int m = board.length, n = board[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] != 1 || vis[x][y])
            return;

        vis[x][y] = true;

        dfs(x + 1, y, board, vis);
        dfs(x - 1, y, board, vis);
        dfs(x, y + 1, board, vis);
        dfs(x, y - 1, board, vis);
    }
}