// Last updated: 17/02/2026, 16:18:30
1class Solution {
2
3    public List<String> readBinaryWatch(int turnedOn) {
4        List<String> ans = new ArrayList<String>();
5        for (int h = 0; h < 12; ++h) {
6            for (int m = 0; m < 60; ++m) {
7                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
8                    ans.add(h + ":" + (m < 10 ? "0" : "") + m);
9                }
10            }
11        }
12        return ans;
13    }
14}