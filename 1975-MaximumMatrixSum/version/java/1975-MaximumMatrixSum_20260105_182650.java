// Last updated: 05/01/2026, 18:26:50
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        int min = Integer.MAX_VALUE;
4        long sum = 0;
5        boolean even = true;
6        for (int i = 0; i < matrix.length; i++) {
7            for (int j = 0; j < matrix[0].length; j++) {
8                min = Math.min(min, Math.abs(matrix[i][j]));
9                sum = sum + Math.abs(matrix[i][j]);
10                if (matrix[i][j] < 0)
11                    even = !even;
12            }
13        }
14        System.out.println(sum + " " + min);
15        return (even) ? sum : sum - 2L * min;
16    }
17}