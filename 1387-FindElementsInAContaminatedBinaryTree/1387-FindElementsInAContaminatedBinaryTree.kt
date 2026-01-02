// Last updated: 02/01/2026, 10:08:27
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
class FindElements(root: TreeNode?) {
    private val set = HashSet<Int>()

    init {
        dfs(root, 0)
    }

    fun find(target: Int): Boolean {
        return set.contains(target)
    }

    private fun dfs(root: TreeNode?, value: Int) {
        if (root == null) return
        root.`val` = value
        set.add(value)
        dfs(root.left, 2 * value + 1)
        dfs(root.right, 2 * value + 2)
    }
}


/**
 * Your FindElements object will be instantiated and called as such:
 * var obj = FindElements(root)
 * var param_1 = obj.find(target)
 */