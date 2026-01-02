// Last updated: 02/01/2026, 10:08:55
class Solution {
    public boolean reorderedPowerOf2(int n) {
         int[] countN = digitCount(n);

        for (int i = 0; i < 31; i++) { 
            int power = 1 << i;
            if (matches(countN, digitCount(power))) {
                return true;
            }
        }
        return false;
    }

boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    
    int[] digitCount(int n) {
        int[] count = new int[10];
        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }
        return count;
    }

}