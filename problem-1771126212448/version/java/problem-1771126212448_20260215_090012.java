// Last updated: 15/02/2026, 09:00:12
1class Solution {
2    public int almostPalindromic(String s) {
3        int n = s.length();
4        boolean[][] pal = new boolean[n][n];
5        boolean[][] almost = new boolean[n][n];
6        int maxLen = 0;
7
8        for (int i = 0; i < n; i++) {
9            pal[i][i] = true;
10            almost[i][i] = false;
11        }
12
13        for (int i = 0; i < n - 1; i++) {
14            if (s.charAt(i) == s.charAt(i + 1)) {
15                pal[i][i + 1] = true;
16                almost[i][i + 1] = true;
17            } else {
18                pal[i][i + 1] = false;
19                almost[i][i + 1] = true;
20            }
21            if (almost[i][i + 1]) maxLen = 2;
22        }
23
24        for (int len = 3; len <= n; len++) {
25            for (int i = 0; i <= n - len; i++) {
26                int j = i + len - 1;
27                if (s.charAt(i) == s.charAt(j)) {
28                    pal[i][j] = pal[i + 1][j - 1];
29                    almost[i][j] = pal[i + 1][j - 1] || almost[i + 1][j - 1];
30                } else {
31                    pal[i][j] = false;
32                    almost[i][j] = pal[i + 1][j] || pal[i][j - 1];
33                }
34                if (almost[i][j]) maxLen = Math.max(maxLen, len);
35            }
36        }
37
38        return maxLen;
39    }
40}
41