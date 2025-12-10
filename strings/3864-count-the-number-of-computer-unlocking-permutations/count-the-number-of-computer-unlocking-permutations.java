class Solution {
    public int countPermutations(int[] complexity) {
        for (int i = 1; i < complexity.length; i++) {
            if (complexity[i] <= complexity[0]) {
                return 0;
            }
        }
        return calculateFactorial(complexity.length - 1);
    }

    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        final long MOD = 1000000007;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return (int)result;
    }
}