// Last updated: 02/01/2026, 10:10:51
class Solution {
    public String countAndSay(int n) {
        return rle(n);
    }
    String rle(int n){
        if(n==1) return "1";
        String s=rle(n-1);
        int count=0;
        char prev=s.charAt(0);
        StringBuffer s1=new StringBuffer();
        for(char i:s.toCharArray()){
            if (i == prev) {
                count++;
            } 
            else{
                s1.append(Integer.toString(count)+prev);
                count=1;
                prev=i;
            }
        }
        s1.append(count).append(prev);
        return s1.toString();
    }
}