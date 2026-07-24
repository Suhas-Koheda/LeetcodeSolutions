// Last updated: 24/07/2026, 21:06:30
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3         int st=start[0]+start[1];
4        int tg=target[0]+target[1];
5        return st%2==tg%2;
6    }
7}