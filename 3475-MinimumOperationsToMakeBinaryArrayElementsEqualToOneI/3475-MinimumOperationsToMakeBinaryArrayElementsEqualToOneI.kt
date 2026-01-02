// Last updated: 02/01/2026, 10:06:48
class Solution {
    fun minOperations(nums: IntArray): Int {
        val n = nums.size
        var count = 0
        for (s in 0 until n - 2) {
            if (nums[s] == 0) {
                nums[s] = 1 - nums[s]
                nums[s + 1] = 1 - nums[s + 1]
                nums[s + 2] = 1 - nums[s + 2]
                count++
            }
        }
        return if (nums[n - 1] == 0 || nums[n - 2] == 0) -1 else count
    }
}
