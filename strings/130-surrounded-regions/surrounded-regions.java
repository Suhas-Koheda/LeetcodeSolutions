class Solution {
    public void solve(char[][] board) {
         if (board == null || board.length == 0) return;

        int m = board.length, n = board[0].length;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') dfs(i, 0, board, vis);
            if (board[i][n - 1] == 'O') dfs(i, n - 1, board, vis);
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') dfs(0, j, board, vis);
            if (board[m - 1][j] == 'O') dfs(m - 1, j, board, vis);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !vis[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    void dfs(int x, int y, char[][] board, boolean[][] vis) {
        int m = board.length, n = board[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] != 'O' || vis[x][y])
            return;

        vis[x][y] = true;

        dfs(x + 1, y, board, vis);
        dfs(x - 1, y, board, vis);
        dfs(x, y + 1, board, vis);
        dfs(x, y - 1, board, vis);
    }
}