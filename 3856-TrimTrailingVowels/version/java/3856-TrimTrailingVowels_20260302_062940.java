// Last updated: 02/03/2026, 06:29:40
1class Solution {
2    public String trimTrailingVowels(String s) {
3        StringBuilder s1=new StringBuilder(s);
4        int r=s1.length()-1;
5        while(r>=0 && (s1.charAt(r)=='a'||s1.charAt(r)=='e'||s1.charAt(r)=='i'||s1.charAt(r)=='o'||s1.charAt(r)=='u')){
6            s1.deleteCharAt(r);
7            r--;
8        }
9        return s1.toString();
10    }
11}