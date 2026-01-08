// Last updated: 08/01/2026, 11:24:29
1class Solution {
2    public int maxDotProduct(int[] nums1, int[] nums2) {
3        int dp[][] = new int[501][501];
4        for (int i = 0; i < 501; i++) {
5            Arrays.fill(dp[i], -100000000);
6        }
7        return solve(nums1, nums2, 0, 0,dp);
8    }
9
10    public int solve(int nums1[], int nums2[], int i, int j, int dp[][]) {
11        if (dp[i][j] != -100000000)
12            return dp[i][j];
13        if (i == nums1.length || j == nums2.length)
14            return -100000000;
15        int val = nums1[i] * nums2[j];
16        return dp[i][j] = Math.max(val, Math.max(solve(nums1, nums2, i + 1, j,dp),
17                Math.max(solve(nums1, nums2, i + 1, j + 1,dp)+val, solve(nums1, nums2, i, j + 1,dp))));
18    }
19}