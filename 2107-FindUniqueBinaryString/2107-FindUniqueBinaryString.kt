// Last updated: 02/01/2026, 10:07:43
class Solution {
    fun findDifferentBinaryString(nums: Array<String>): String {
      val n = nums.size
    val res = StringBuilder("")
    for (i in 0 until n) {
        val ch = if (nums[i][i] == '0') '1' else '0'
        res.append(ch)
    }
    return res.toString()   
    }
}