// Last updated: 03/01/2026, 20:26:35
1class Solution {
2    final int MOD = 1_000_000_007;
3    String states[] = { "RYG", "RGY", "RYR", "RGR", "YRG", "YGR", "YGY", "YRY", "GRY", "GYR", "GRG", "GYG" };
4    Integer dp[][];
5
6    public int numOfWays(int n) {
7        dp = new Integer[n][12];
8        int result = 0;
9        for (int i = 0; i < 12; i++) {
10            result = (result + solve(n - 1, i)) % MOD;
11        }
12        return result;
13    }
14
15    int solve(int n, int previous) {
16        if (n == 0)
17            return 1;
18        if (dp[n][previous] != null)
19            return dp[n][previous];
20        int result = 0;
21        String last = states[previous];
22        for (int curr = 0; curr < 12; curr++) {
23            String currState = states[curr];
24            if (curr == previous)
25                continue;
26            boolean flag = false;
27            for (int i = 0; i < 3; i++) {
28                if (currState.charAt(i) == last.charAt(i)) {
29                    flag = true;
30                    break;
31                }
32            }
33            if (!flag)
34                result = (result + solve(n - 1, curr)) % MOD;
35        }
36        return dp[n][previous] = result;
37    }
38}