// Last updated: 30/06/2026, 07:51:02
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5
6        reverse(nums, 0, n - 1);
7        reverse(nums, 0, k - 1);
8        reverse(nums, k, n - 1);
9    }
10
11    public void reverse(int[] arr, int l, int r) {
12        while (l < r) {
13            int temp = arr[l];
14            arr[l] = arr[r];
15            arr[r] = temp;
16
17            l++;
18            r--;
19        }
20    }
21}