// Last updated: 02/01/2026, 10:08:49
class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                open++;
            else if (open != 0)
                open--;
            else
                close++;
        }
        return open + close;
    }
}