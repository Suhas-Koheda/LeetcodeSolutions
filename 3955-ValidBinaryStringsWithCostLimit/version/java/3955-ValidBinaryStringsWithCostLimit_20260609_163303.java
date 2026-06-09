// Last updated: 09/06/2026, 16:33:03
1class Solution {
2    public List<String> generateValidStrings(int n, int k) {
3        List<String> ans = new ArrayList<>();
4        dfs(0, n, k, false, new StringBuilder(), ans);
5        return ans;
6    }
7
8    private void dfs(int idx, int n, int rem, boolean prevOne,
9                     StringBuilder sb, List<String> ans) {
10
11        if (idx == n) {
12            ans.add(sb.toString());
13            return;
14        }
15
16        sb.append('0');
17        dfs(idx + 1, n, rem, false, sb, ans);
18        sb.deleteCharAt(sb.length() - 1);
19
20        if (!prevOne && idx <= rem) {
21            sb.append('1');
22            dfs(idx + 1, n, rem - idx, true, sb, ans);
23            sb.deleteCharAt(sb.length() - 1);
24        }
25    }
26}