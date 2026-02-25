// Last updated: 25/02/2026, 11:29:12
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
4            int c1 = Integer.bitCount(a);
5            int c2 = Integer.bitCount(b);
6
7            if (c1 == c2)
8                return a - b;
9            return c1 - c2;
10        });
11        for (int i : arr) {
12            pq.add(i);
13        }
14        int k = 0;
15        while (!pq.isEmpty())
16            arr[k++] =pq.poll();
17        return arr;
18    }
19}