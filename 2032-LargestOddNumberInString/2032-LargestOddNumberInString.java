// Last updated: 02/01/2026, 10:07:49
class Solution {
    public String largestOddNumber(String num) {
        int r = num.length() - 1;
        while (r >= 0) {
            if ((num.charAt(r) - '0') % 2 != 0) {
                break;
            } else {
                r--;
            }
        }
        if (r == -1)
            return "";
        return num.substring(0, r + 1);
    }
}