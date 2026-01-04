// Last updated: 04/01/2026, 09:49:32
1import java.util.*;
2
3class Solution {
4    HashMap<Integer, List<Integer>> cache = new HashMap<>();
5
6    public int sumFourDivisors(int[] nums) {
7        int ans = 0;
8
9        for (int n : nums) {
10            List<Integer> divisors = getDivisors(n);
11
12            if (divisors.size() == 4) {
13                for (int d : divisors) {
14                    ans += d;
15                }
16            }
17        }
18        return ans;
19    }
20
21    public List<Integer> getDivisors(int n) {
22        if (cache.containsKey(n)) {
23            return cache.get(n);
24        }
25
26        List<Integer> res = new ArrayList<>();
27
28        for (int i = 1; i * i <= n; i++) {
29            if (n % i == 0) {
30                res.add(i);
31                if (i != n / i) {
32                    res.add(n / i);
33                }
34                if (res.size() > 4) {
35                    break;
36                }
37            }
38        }
39        if (res.size() <= 4) {
40            cache.put(n, res);
41        }
42        return res;
43    }
44}