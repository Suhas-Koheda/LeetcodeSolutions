// Last updated: 06/02/2026, 14:37:47
1class Solution {
2    public int countMonobit(int n) {
3        int count=1;
4        for(int i=1;i<=n;i++){
5            if((i&1)==1){
6                String s=Integer.toBinaryString(i);
7                char a=s.charAt(0);
8                boolean flag=true;
9                for(int j=1;j<s.length();j++){
10                    if(a!=s.charAt(j)) flag=false;
11                }
12                if(flag) count++;
13            }
14        }
15        return count;
16    }
17}