// Last updated: 02/01/2026, 10:08:36
class Solution {
    private var len: Int = 0

    fun numTilePossibilities(tiles: String): Int {
        len = tiles.length
        val used = BooleanArray(len)
        val set = HashSet<String>()
        backtrack(tiles, used, set, "")
        return set.size - 1
    }

    private fun backtrack(tiles: String, used: BooleanArray, set: HashSet<String>, cur: String) {
        if (set.contains(cur)) return
        set.add(cur)
        for (i in 0 until len) {
            if (used[i]) continue
            used[i] = true
            backtrack(tiles, used, set, cur + tiles[i])
            used[i] = false
        }
    }
}
