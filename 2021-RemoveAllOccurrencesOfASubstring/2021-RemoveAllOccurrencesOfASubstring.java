// Last updated: 02/01/2026, 10:07:50
class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            st.push(i);
            if(st.size()>=part.length() && check(st,part)){
                for(int j=0;j<part.length();j++){
                    st.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    boolean check(Stack<Character>st , String part){
        Stack<Character>temp=new Stack<>();
        temp.addAll(st);
        for(int i=part.length()-1;i>=0;i--){
            if(temp.isEmpty()||temp.peek()!=part.charAt(i)){
                return false;
            }
            temp.pop();
        }
        return true;
    }
}