// Last updated: 02/01/2026, 10:09:12
class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int[] last = new int[10];
        
        for (int i = 0; i < digits.length; i++) {
            last[digits[i] - '0'] = i;
        }
        
        int j = 0;
        for (int i = 0; i < digits.length; i++) {
            for (int d = 9; d > digits[i] - '0'; d--) {
                if (last[d] > i) {
                    j = last[d];
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                    String s = "";
                    for (int k = 0; k < digits.length; k++) {
                        s = s + digits[k];
                    }
                    return Integer.parseInt(s);
                }
            }
        }
        return num;
    }
}
