class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (open !=0) {
                    result.append(ch);
                }
                open++;
            } else if (ch == ')') {
                open--;
                if (open!= 0) {
                    result.append(ch);
                }
            }
        }
        
        return result.toString();
    }
}