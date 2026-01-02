// Last updated: 02/01/2026, 10:07:56
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(i) == '1') {
                    arr[j] += Math.abs(i - j);
                }
            }
        }
        return arr;
    }
}
