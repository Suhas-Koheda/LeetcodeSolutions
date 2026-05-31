// Last updated: 31/05/2026, 08:13:29
1class Solution {
2    public int maximumSaleItems(int[][] items, int budget) {
3        int n=items.length;
4        int bonus[]=new int[n];
5        for(int i=0;i<n;i++){
6            int f=items[i][0];
7            for(int j=0;j<n;j++){
8                if(i!=j && items[j][0]%f==0){
9                    bonus[i]++;
10                }
11            }
12        }
13        int[] dp = new int[budget + 1];
14
15        for (int i = 0; i < n; i++) {
16            int price = items[i][1];
17            int free = bonus[i];
18
19            int[] ndp = dp.clone();
20
21            for (int r = 0; r < price; r++) {
22                int best = Integer.MIN_VALUE / 2;
23                int m = 0;
24
25                for (int pos = r; pos <= budget; pos += price, m++) {
26
27                    if (best > Integer.MIN_VALUE / 4) {
28                        ndp[pos] = Math.max(ndp[pos], best + m + free);
29                    }
30
31                    best = Math.max(best, dp[pos] - m);
32                }
33            }
34
35            dp = ndp;
36        }
37
38        int ans = 0;
39        for (int x : dp) {
40            ans = Math.max(ans, x);
41        }
42
43        return ans;
44    }
45}