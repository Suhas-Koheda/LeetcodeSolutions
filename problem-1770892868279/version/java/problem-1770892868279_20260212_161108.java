// Last updated: 12/02/2026, 16:11:08
1import java.util.*;
2
3class Solution {
4    public List<Long> mergeAdjacent(int[] nums) {
5        Deque<Long> stack = new ArrayDeque<>();
6
7        for (int num : nums) {
8            long current = num;
9            while (!stack.isEmpty() && stack.peekLast() == current) {
10                current = stack.pollLast() + current;
11            }
12
13            stack.addLast(current);
14        }
15
16        return new ArrayList<>(stack);
17    }
18}
19