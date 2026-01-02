// Last updated: 02/01/2026, 10:07:16
class Solution {
    fun applyOperations(nums: IntArray): IntArray {
        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
                nums[i] *= 2
                nums[i + 1] = 0
            }
        }
        var j = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                if (i != j) {
                    val temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                }
                j += 1
            }
        }
        return nums
    }
}