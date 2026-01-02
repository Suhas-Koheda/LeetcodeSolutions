// Last updated: 02/01/2026, 10:09:30
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!s.isEmpty()&&k>0 && s.peek()-'0'>num.charAt(i)-'0'){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }
        while(k>0){
            s.pop();
            k--;
        }
        if(s.isEmpty()){
            return "0";
        }
        StringBuilder s1=new StringBuilder();
        while(!s.isEmpty()){
            s1.append(s.pop());
        }
        s1.reverse();
        while(s1.length() > 1 && s1.charAt(0)=='0'){
            s1.deleteCharAt(0);
        }
        return s1.toString();
    }
}