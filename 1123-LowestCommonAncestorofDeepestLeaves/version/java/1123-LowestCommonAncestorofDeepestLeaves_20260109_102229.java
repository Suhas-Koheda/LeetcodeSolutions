// Last updated: 09/01/2026, 10:22:29
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int depth;
    TreeNode ans;
    private int solve(TreeNode node, int d){
        if(node == null){
            return 0;
        }
        int l = this.solve(node.left,d+1);
        int r = this.solve(node.right,d+1);

        if(l == r && l+d >= depth){
            depth = l+d;
            ans = node;
        }
        return Math.max(l,r)+1;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        depth = 0;
        ans = null;
        solve(root,0);
        return ans;
    }
}