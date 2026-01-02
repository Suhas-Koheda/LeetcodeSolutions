// Last updated: 02/01/2026, 10:09:23
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l=0,r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<g.length && r<s.length){
            if(g[l]<=s[r]){
                l++;
                
            }
            r++;
        }
        return l;
    }
}