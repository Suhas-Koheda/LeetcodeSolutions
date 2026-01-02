// Last updated: 02/01/2026, 10:08:08
class Solution {
    public boolean canArrange(int[] arr, int k) {
         int[] remainderCount = new int[k];
        for (int num : arr) {
            int remainder = ((num % k) + k) % k;
            remainderCount[remainder]++;
        }
        for (int i = 1; i < k; i++) {
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;
            }
        }
        return remainderCount[0] % 2 == 0;
    }
}