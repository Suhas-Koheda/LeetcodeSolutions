// Last updated: 30/06/2026, 08:04:32
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j = -1;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] == 0) {
6                j = i;
7                break;
8            }
9        }
10        if (j == -1)
11            return;
12        for (int i = j + 1; i < nums.length; i++) {
13            if (nums[i] != 0) {
14                int temp = nums[i];
15                nums[i] = nums[j];
16                nums[j] = temp;
17                j++;
18            }
19        }
20    }
21}