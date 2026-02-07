// Last updated: 07/02/2026, 15:30:50
1class Solution {
2    public int minimumK(int[] nums) {
3        int max = 0;
4        for (int x : nums) {
5            max = Math.max(max, x);
6        }
7        long sum = 0;
8        for (int x : nums)
9            sum += x;
10        int left = 1;
11        int right = (int) Math.sqrt(sum) + 2;
12        int answer = max;
13
14        while (left <= right) {
15            int mid = left + (right - left) / 2;
16
17            if (canMakeNonPositive(nums, mid)) {
18                answer = mid;
19                right = mid - 1;
20            } else {
21                left = mid + 1; // need bigger k
22            }
23        }
24
25        return answer;
26    }
27
28    private boolean canMakeNonPositive(int[] nums, int k) {
29        long operations = 0;
30        long limit = (long) k * k;
31
32        for (int x : nums) {
33            operations += (x + k - 1) / k;
34
35            if (operations > limit) {
36                return false;
37            }
38        }
39
40        return true;
41    }
42}
43