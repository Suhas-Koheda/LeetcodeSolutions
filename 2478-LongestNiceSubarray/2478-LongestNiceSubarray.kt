// Last updated: 02/01/2026, 10:07:20
class Solution {
    fun longestNiceSubarray(nums: IntArray): Int {
        var start = 0
        var maxLen = 0
        var bitMask = 0
        val n = nums.size
        
        for (end in 0 until n) {
            while (bitMask and nums[end] != 0) {
                bitMask = bitMask xor nums[start]
                start++
            }
            bitMask = bitMask or nums[end]
            maxLen = maxOf(maxLen, end - start + 1)
        }
        
        return maxLen
    }
}
