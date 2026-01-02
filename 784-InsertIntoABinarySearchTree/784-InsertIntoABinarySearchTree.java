// Last updated: 02/01/2026, 10:09:03
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        if(root==null){
            newNode.left=null;
            newNode.right=null;
            root=newNode;
        }
        else if(val<root.val){
            root.left=insertIntoBST(root.left,val);
        }
        else if(val>root.val){
            root.right=insertIntoBST(root.right,val);
        }
        System.gc();
        return root;
    }
}