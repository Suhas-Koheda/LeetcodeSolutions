// Last updated: 02/01/2026, 10:08:53
/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 *     constructor(`val`: Int, left: TreeNode?, right: TreeNode?) : this(`val`) {
 *         this.left = left
 *         this.right = right
 *     }
 * }
 */
class Solution {
    private val map = HashMap<Int, Int>()

    fun constructFromPrePost(preorder: IntArray, postorder: IntArray): TreeNode? {
        val n = postorder.size
        for (i in 0 until n) {
            map[postorder[i]] = i
        }
        return recur(0, n - 1, 0, n - 1, preorder, postorder)
    }

    private fun recur(i1: Int, i2: Int, j1: Int, j2: Int, preorder: IntArray, postorder: IntArray): TreeNode? {
        if (i1 > i2 || j1 > j2) {
            return null
        }
        
        val root = TreeNode(preorder[i1])
        
        if (i1 == i2) {
            return root
        }

        val r = map[preorder[i1 + 1]]!!
        val size = r - j1 + 1
        
        root.left = recur(i1 + 1, i1 + size, j1, r, preorder, postorder)
        root.right = recur(i1 + size + 1, i2, r + 1, j2 - 1, preorder, postorder)
        
        return root
    }
}
