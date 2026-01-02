// Last updated: 02/01/2026, 10:08:13
class Solution {
    private var res: String = ""
    private var count: Int = 0

    fun getHappyString(n: Int, k: Int): String {
        count = 0
        res = ""
        backtrack(n, k, StringBuilder())
        return res
    }

    private fun backtrack(n: Int, k: Int, cur: StringBuilder): Boolean {
        if (cur.length == n) {
            count++
            if (count == k) {
                res = cur.toString()
                return true
            }
            return false
        }

        for (ch in 'a'..'c') {
            val len = cur.length
            if (len > 0 && cur[len - 1] == ch) continue
            cur.append(ch)
            if (backtrack(n, k, cur)) {
                return true
            }
            cur.deleteCharAt(cur.length - 1)
        }
        return false
    }
}
