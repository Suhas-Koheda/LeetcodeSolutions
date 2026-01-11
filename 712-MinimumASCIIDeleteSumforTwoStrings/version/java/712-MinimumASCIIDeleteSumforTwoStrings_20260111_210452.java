// Last updated: 11/01/2026, 21:04:52
1class Solution {
2    int m, n;
3    int[][] t;
4
5    public int minimumDeleteSum(String s1, String s2) {
6        m = s1.length();
7        n = s2.length();
8
9        t = new int[m + 1][n + 1];
10        for (int i = 0; i <= m; i++) {
11            for (int j = 0; j <= n; j++) {
12                t[i][j] = -1;
13            }
14        }
15
16        return solve(s1, s2, 0, 0);    
17    }
18
19    private int solve(String s1, String s2, int i, int j) {
20        if (i >= m && j >= n)
21            return 0;
22
23        if (t[i][j] != -1)
24            return t[i][j];
25
26        if (i >= m) {
27            return t[i][j] = s2.charAt(j) + solve(s1, s2, i, j + 1);
28        } 
29        if (j >= n) {
30            return t[i][j] = s1.charAt(i) + solve(s1, s2, i + 1, j);
31        }
32
33        if (s1.charAt(i) == s2.charAt(j)) {
34            return t[i][j] = solve(s1, s2, i + 1, j + 1);
35        }
36
37        int takeS1 = s1.charAt(i) + solve(s1, s2, i + 1, j);
38        int takeS2 = s2.charAt(j) + solve(s1, s2, i, j + 1);
39
40        return t[i][j] = Math.min(takeS1, takeS2);
41    }
42}