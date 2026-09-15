// Last updated: 15/09/2026, 18:06:01
1class Solution {
2    public int numIslands(char[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5
6        boolean[][] visited = new boolean[n][m];
7        int count = 0;
8
9        for (int i = 0; i < n; i++) {
10            for (int j = 0; j < m; j++) {
11                if (grid[i][j] == '1' && !visited[i][j]) {
12                    dfs(i, j, visited, grid);
13                    count++;
14                }
15            }
16        }
17
18        return count;
19    }
20
21    void dfs(int x, int y, boolean[][] visited, char[][] grid) {
22        int n = grid.length;
23        int m = grid[0].length;
24
25        visited[x][y] = true;
26
27        int[] dx = {-1, 1, 0, 0};
28        int[] dy = {0, 0, -1, 1};
29
30        for (int i = 0; i < 4; i++) {
31            int nx = x + dx[i];
32            int ny = y + dy[i];
33
34            if (isValid(nx, ny, n, m)
35                    && grid[nx][ny] == '1'
36                    && !visited[nx][ny]) {
37
38                dfs(nx, ny, visited, grid);
39            }
40        }
41    }
42
43    boolean isValid(int x, int y, int n, int m) {
44        return x >= 0 && x < n && y >= 0 && y < m;
45    }
46}