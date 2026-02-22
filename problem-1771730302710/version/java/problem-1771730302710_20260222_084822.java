// Last updated: 22/02/2026, 08:48:22
1class Solution {
2    public String maximumXor(String s, String t) {
3        int zeroes = 0, ones = 0;
4        for (char i : t.toCharArray()) {
5            if (i == '0')
6                zeroes++;
7            else
8                ones++;
9        }
10        StringBuffer s1 = new StringBuffer();
11        for (char i : s.toCharArray()) {
12            if (i == '1' && zeroes > 0) {
13                s1.append('1');
14                zeroes--;
15            } else if (i == '0' && ones > 0) {
16                s1.append('1');
17                ones--;
18            } else {
19                if (zeroes > 0) {
20                    s1.append('0');
21                    zeroes--;
22                } else {
23                    s1.append('0');
24                    ones--;
25                }
26            }
27        }
28        return s1.toString();
29    }
30}