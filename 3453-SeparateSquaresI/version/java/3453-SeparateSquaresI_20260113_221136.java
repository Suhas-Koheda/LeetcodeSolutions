// Last updated: 13/01/2026, 22:11:36
1class Solution {
2    public double separateSquares(int[][] squares) {
3        double low = Double.MAX_VALUE;
4        double high = -Double.MAX_VALUE;
5        double total = 0.0;
6
7        for (int[] square : squares) {
8            double y = square[1];
9            double l = square[2];
10
11            total += l * l;
12            low = Math.min(low, y);
13            high = Math.max(high, y + l);
14        }
15
16        double resultY = 0.0;
17
18        while (high - low > 1e-5) {
19            double midY = low + (high - low) / 2.0;
20            resultY = midY;
21
22            if (check(squares, midY, total)) {
23                high = midY;
24            } else {
25                low = midY;
26            }
27        }
28
29        return resultY;
30    }
31    private boolean check(int[][] squares, double midY, double total) {
32        double bottomArea = 0.0;
33
34        for (int[] square : squares) {
35            double y = square[1];
36            double l = square[2];
37
38            double bottomY = y;
39            double topY = y + l;
40
41            if (midY >= topY) {
42                bottomArea += l * l;
43            } else if (midY > bottomY) {
44                bottomArea += (midY - bottomY) * l;
45            }
46        }
47
48        return bottomArea >= total / 2.0;
49    }
50}