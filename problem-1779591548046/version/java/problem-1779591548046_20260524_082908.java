// Last updated: 24/05/2026, 08:29:08
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return 0;
5        int pos = 0;
6        for (int i = 0; i < n; i++) {
7            if (nums[i] == 0) {
8                pos = i;
9                break;
10            }
11        }
12        boolean decreasing = true, increasing = true;
13        for (int i = 0; i < n; i++) {
14            int next = nums[(i + 1) % n];
15            if ((next - nums[i] + n) % n != 1) {
16                increasing = false;
17            }
18            if ((nums[i] - next + n) % n != 1) {
19                decreasing = false;
20            }
21        }
22        if (increasing) {
23            return Math.min(pos, n - pos + 2);
24        }
25        if (decreasing) {
26            return Math.min(n - pos, pos + 2);
27        }
28        return -1;
29    }
30}