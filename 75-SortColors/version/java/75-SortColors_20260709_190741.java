// Last updated: 09/07/2026, 19:07:41
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0, mid = 0, high = nums.length - 1;
4        while (mid <= high) {
5            if (nums[mid] == 0) {
6                int tmp = nums[low];
7                nums[low++] = nums[mid];
8                nums[mid++] = tmp;
9            } else if (nums[mid] == 1) {
10                mid++;
11            } else {
12                int tmp = nums[mid];
13                nums[mid] = nums[high];
14                nums[high--] = tmp;
15            }
16        }
17    }
18}