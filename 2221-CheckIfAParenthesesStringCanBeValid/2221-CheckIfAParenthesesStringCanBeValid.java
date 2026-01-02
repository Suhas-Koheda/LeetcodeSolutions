// Last updated: 02/01/2026, 10:07:38
class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0)
            return false;

        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char lock = locked.charAt(i);

            if (c == '(' && lock == '1') {
                min++;
                max++;
            } else if (c == ')' && lock == '1') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }

            if (min < 0)
                min = 0;
            if (max < 0)
                return false;
        }

        return min == 0;
    }
}
