// Last updated: 02/01/2026, 10:08:23
class Solution {
    fun numberOfSubstrings(s: String): Int {
        val freq = IntArray(3)
        var count = 0
        var curCount = 0
        var left = 0
        val n = s.length

        for (right in 0 until n) {
            val ch = s[right]
            freq[ch - 'a']++
            if (freq[ch - 'a'] == 1) {
                curCount++
            }
            while (curCount == 3) {
                count += (n - right)
                val c = s[left]
                freq[c - 'a']--
                if (freq[c - 'a'] == 0) {
                    curCount--
                }
                left++
            }
        }
        return count
    }
}
