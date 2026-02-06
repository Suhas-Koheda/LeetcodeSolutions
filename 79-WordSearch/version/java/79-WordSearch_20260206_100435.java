// Last updated: 06/02/2026, 10:04:35
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        int i, j = 0;
4        boolean visited[][] = new boolean[board.length][board[0].length];
5        outer: for (i = 0; i < board.length; i++) {
6            for (j = 0; j < board[0].length; j++) {
7                if (board[i][j] == word.charAt(0) && !visited[i][j]) {
8                    visited[i][j] = true;
9                    if (solve(board, i, j, word.substring(1), visited)) {
10                        return true;
11                    }
12                    visited[i][j] = false;
13                }
14            }
15        }
16        return false;
17    }
18
19    boolean solve(char board[][], int k, int j, String s, boolean visited[][]) {
20        if (s.isEmpty())
21            return true;
22        if (k < 0 || j < 0 || k >= board.length || j >= board[0].length)
23            return false;
24
25        int[] dr = { -1, 0, 1, 0 };
26        int[] dc = { 0, 1, 0, -1 };
27
28        for (int i = 0; i < 4; i++) {
29            int newR = k + dr[i];
30            int newC = j + dc[i];
31
32            if (newR < 0 || newC < 0 ||
33                    newR >= board.length || newC >= board[0].length)
34                continue;
35
36            if (board[newR][newC] == s.charAt(0) && !visited[newR][newC]) {
37                visited[newR][newC] = true;
38                if(solve(board, newR, newC, s.substring(1), visited)) return true;
39                visited[newR][newC] = false;
40            }
41        }
42        return false;
43    }
44}