// Last updated: 24/05/2026, 08:10:43
1class Solution {
2    public int passwordStrength(String password) {
3        HashSet<Character> set=new HashSet<>();
4        for (char i:password.toCharArray()){
5            set.add(i);
6        }
7        int str=0;
8        for (char ch : set) {
9            if (ch >= 'a' && ch <= 'z') {
10                str += 1;
11            } else if (ch >= 'A' && ch <= 'Z') {
12                str += 2;
13            } else if (ch >= '0' && ch <= '9') {
14                str += 3;
15            } else if ("!@#$".indexOf(ch) != -1) {
16                str += 5;
17            }
18        }
19        return str;
20    }
21}