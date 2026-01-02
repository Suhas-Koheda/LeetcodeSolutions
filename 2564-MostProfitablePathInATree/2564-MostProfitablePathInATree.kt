// Last updated: 02/01/2026, 10:07:15
class Solution {
    private lateinit var adj: Array<MutableList<Int>>
    private lateinit var bobPath: MutableMap<Int, Int>
    private var max = Int.MIN_VALUE
    private lateinit var amount: IntArray
    private lateinit var visited: BooleanArray

    fun mostProfitablePath(edges: Array<IntArray>, bob: Int, amount: IntArray): Int {
        val n = amount.size
        bobPath = mutableMapOf()
        this.amount = amount
        adj = Array(n) { mutableListOf() }
        visited = BooleanArray(n)

        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            adj[u].add(v)
            adj[v].add(u)
        }

        bobPath(bob, 0)
        visited.fill(false)
        alice(0, 0, 0)

        return max
    }

    private fun bobPath(node: Int, time: Int): Boolean {
        visited[node] = true
        bobPath[node] = time

        if (node == 0) {
            return true
        }

        for (nei in adj[node]) {
            if (!visited[nei] && bobPath(nei, time + 1)) {
                return true
            }
        }

        bobPath.remove(node)
        return false
    }

    private fun alice(node: Int, time: Int, income: Int) {
        visited[node] = true

        var currentIncome = income
        if (!bobPath.containsKey(node) || time < bobPath[node]!!) {
            currentIncome += amount[node]
        } else if (time == bobPath[node]) {
            currentIncome += amount[node] / 2
        }

        if (adj[node].size == 1 && node != 0) {
            max = max.coerceAtLeast(currentIncome)
        }

        for (nei in adj[node]) {
            if (!visited[nei]) {
                alice(nei, time + 1, currentIncome)
            }
        }
    }
}
