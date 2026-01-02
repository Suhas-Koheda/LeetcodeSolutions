// Last updated: 02/01/2026, 10:09:04
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if (target < nums[middle])
                end = middle - 1;
            else if (target > nums[middle])
                start = middle + 1;
            else if (target == nums[middle])
                return middle;
        }
        return -1;
    }
}