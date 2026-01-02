// Last updated: 02/01/2026, 10:11:19
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int idx=0;
        if(s.length()==0){
            return 0;
        }
        int sign=1;
        if(s.charAt(idx)=='-'){
            sign=-1;
            idx++;
        }
        else if(s.charAt(idx)=='+'){
            idx++;
        }
        int sum=0;
        while(idx<s.length() && Character.isDigit(s.charAt(idx))){
            int digit=s.charAt(idx) - '0';
             if (sum > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            sum = sum * 10 + digit;
            idx++;
        }
        return sign*sum;
    }
}