// Last updated: 22/02/2026, 08:38:09
1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        int temp = n;
4        HashMap<Integer, Long> map = new HashMap<>();
5        HashMap<Integer, Long> freq = new HashMap<>();
6        while (temp > 0) {
7            int r = temp % 10;
8            if (!map.containsKey(r)) {
9                map.put(r, factorial(r));
10            }
11            freq.put(r, freq.getOrDefault(r, 0L) + 1);
12            temp = temp / 10;
13        }
14        long sum = 0;
15        for (int i : freq.keySet()) {
16            sum = sum + (map.get(i) * freq.get(i));
17        }
18        HashMap<Integer, Long> newM = new HashMap<>();
19        while (sum > 0) {
20            int r = (int)sum % 10;
21            newM.put( r, newM.getOrDefault(r, 0L) + 1);
22            sum = sum / 10;
23        }
24        return freq.equals(newM);
25    }
26
27    public long factorial(int n) {
28        long prod = 1;
29        for (int i = 1; i <= n; i++)
30            prod = prod * i;
31        return prod;
32    }
33}