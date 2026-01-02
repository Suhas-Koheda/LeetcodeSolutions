// Last updated: 02/01/2026, 10:08:04
class Solution {
    public int maxDepth(String s) {
        int max = -1;
        int maxx = 0;
        for (char i : s.toCharArray()) {
            if (i == '(')
                maxx++;
            else if (i == ')')
                maxx--;
            max = Math.max(max, maxx);
        }
        return max;
    }
}