// Last updated: 02/01/2026, 10:08:38
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    private var index = 0
    private var n = 0

    fun recoverFromPreorder(traversal: String): TreeNode? {
        n = traversal.length
        return recur(traversal, 0)
    }

    private fun recur(traversal: String, depth: Int): TreeNode? {
        if (index >= n) return null
        var count = 0
        while (index + count < n && traversal[index + count] == '-') {
            count++
        }

        if (count != depth) return null
        index += count
        var nodeValue = 0
        while (index < n && traversal[index].isDigit()) {
            nodeValue = nodeValue * 10 + (traversal[index] - '0')
            index++
        }


        val node = TreeNode(nodeValue)
        
        node.left = recur(traversal, depth + 1)
        node.right = recur(traversal, depth + 1)

        return node
    }
}
