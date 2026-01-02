// Last updated: 02/01/2026, 10:06:59
class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        long total=0;
        int left=0;
        while(left<n && s.charAt(left)!='1'){
            left++;
        }
        for(int i=left+1;i<n;++i){
            if(s.charAt(i)=='0'){
                total=total+(i-left);
                left++;
            }
        }
        return total;
    }
}