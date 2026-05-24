// Last updated: 24/05/2026, 08:04:37
1import java.util.*;
2
3class Solution {
4    public int[] limitOccurrences(int[] nums, int k) {
5        ArrayList<Integer> ans = new ArrayList<>();
6
7        int count = 0;
8        int prev = -1;
9
10        for (int num : nums) {
11            if (num != prev) {
12                prev = num;
13                count = 1;
14                ans.add(num);
15            } else if (count < k) {
16                ans.add(num);
17                count++;
18            }
19        }
20
21        int[] result = new int[ans.size()];
22
23        for (int i = 0; i < ans.size(); i++) {
24            result[i] = ans.get(i);
25        }
26
27        return result;
28    }
29}