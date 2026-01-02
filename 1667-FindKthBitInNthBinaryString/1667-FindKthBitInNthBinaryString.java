// Last updated: 02/01/2026, 10:08:06
class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        int length = (1 << n) - 1;
        if (k == (length / 2) + 1) return '1';
        if (k < (length / 2) + 1) return findKthBit(n - 1, k);
        return invert(findKthBit(n - 1, length - k + 1));
    }
    public char invert(char bit) {
        return bit == '0' ? '1' : '0';
    }
}
