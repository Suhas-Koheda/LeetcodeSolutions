// Last updated: 23/08/2026, 15:47:26
1class Solution {
2    public int maxScore(int[] c, int k) {
3        int n = c.length;
4
5        int ls = 0;
6        for (int i = 0; i < k; i++) {
7            ls += c[i];
8        }
9
10        int max = ls;
11        int rs = 0;
12
13        for (int i = 0; i < k; i++) {
14            rs += c[n - 1 - i];
15            ls -= c[k - 1 - i];
16
17            max = Math.max(max, ls + rs);
18        }
19
20        return max;
21    }
22}