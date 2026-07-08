// Last updated: 08/07/2026, 21:13:57
1class Solution {
2    public void nextPermutation(int[] nums) {
3
4        int i = nums.length - 2;
5
6        while (i >= 0 && nums[i] >= nums[i + 1])
7            i--;
8
9        if (i >= 0) {
10
11            int j = nums.length - 1;
12
13            while (nums[j] <= nums[i])
14                j--;
15
16            swap(nums, i, j);
17        }
18
19        reverse(nums, i + 1, nums.length - 1);
20    }
21
22    private void swap(int[] nums, int i, int j) {
23        int t = nums[i];
24        nums[i] = nums[j];
25        nums[j] = t;
26    }
27
28    private void reverse(int[] nums, int l, int r) {
29        while (l < r) {
30            swap(nums, l++, r--);
31        }
32    }
33}