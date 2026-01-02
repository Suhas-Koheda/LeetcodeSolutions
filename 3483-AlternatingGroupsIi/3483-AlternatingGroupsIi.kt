// Last updated: 02/01/2026, 10:06:46
class Solution {
    fun numberOfAlternatingGroups(colors: IntArray, k: Int): Int {
        var r = 0
        var left = 0
        val n = colors.size
        
        for (right in 1 until (n + k - 1)) {
            if (colors[right % n] == colors[(right - 1) % n]) {
                left = right
            }
            if (right - left + 1 == k) {
                r++
                left++ 
            }
        }
        return r
    }
}
