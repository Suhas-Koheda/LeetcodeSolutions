// Last updated: 16/02/2026, 07:01:36
1class Solution {
2    public int reverseBits(int n) {
3        String s = String.format("%32s", Integer.toBinaryString(n))
4                .replace(' ', '0');
5
6        String reversed = new StringBuilder(s).reverse().toString();
7
8        return (int) Long.parseLong(reversed, 2);
9    }
10}
11