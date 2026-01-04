// Last updated: 04/01/2026, 09:46:09
1import java.util.*;
2
3class Solution {
4    HashMap<Integer, List<Integer>> cache = new HashMap<>();
5    public int sumFourDivisors(int[] nums) {
6        int ans = 0;
7
8        for (int n : nums) {
9            List<Integer> divisors = getDivisors(n);
10
11            if (divisors.size() == 4) {
12                for (int d : divisors) {
13                    ans += d;
14                }
15            }
16        }
17        return ans;
18    }
19
20    public List<Integer> getDivisors(int n) {
21        if (cache.containsKey(n)) {
22            return cache.get(n);
23        }
24
25        List<Integer> res = new ArrayList<>();
26
27        for (int i = 1; i * i <= n; i++) {
28            if (n % i == 0) {
29                res.add(i);
30                if (i != n / i) {
31                    res.add(n / i);
32                }
33            }
34        }
35        cache.put(n, res);
36        return res;
37    }
38}