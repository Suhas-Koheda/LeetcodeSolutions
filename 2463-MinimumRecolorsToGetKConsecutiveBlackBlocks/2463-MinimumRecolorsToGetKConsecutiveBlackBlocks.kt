// Last updated: 02/01/2026, 10:07:24
class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var w = 0
        for (i in 0 until k) {
            if (blocks[i] == 'W') w++
        }
        var res = w
        val n = blocks.length
        for (i in 1 until n - k + 1) {
            if (blocks[i - 1] == 'W') w--
            if (blocks[i + k - 1] == 'W') w++
            res = minOf(res, w)
        }
        return res
    }
}
