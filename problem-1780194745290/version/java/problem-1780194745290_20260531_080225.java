// Last updated: 31/05/2026, 08:02:25
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int[] freq = new int[10];
4
5        while (n > 0) {
6            freq[n % 10]++;
7            n /= 10;
8        }
9
10        int score = 0;
11        for (int d = 0; d < 10; d++) {
12            score += d * freq[d];
13        }
14
15        return score;
16    }
17}