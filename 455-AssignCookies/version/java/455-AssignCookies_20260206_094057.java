// Last updated: 06/02/2026, 09:40:57
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        System.out.println(Arrays.toString(g));
6        System.out.println(Arrays.toString(s));
7        int count=0;
8        int j=0;
9        int k=0;
10        while(k<s.length) {
11            if( s[k]<g[0]) k++;
12            else  break;
13        }
14        System.out.println(k);
15        for(int i=0;i<g.length;i++){
16            if(k<s.length){
17                if(g[i]<=s[k]){
18                    count++;
19                    k++;
20                }
21                else{
22                    k++;
23                    i--;
24                }
25            }
26        }
27        return count;
28    }
29}