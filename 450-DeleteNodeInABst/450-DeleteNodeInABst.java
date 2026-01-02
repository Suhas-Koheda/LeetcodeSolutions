// Last updated: 02/01/2026, 10:09:25
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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp=new TreeNode();
        if(root==null){
            return null;
        }
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else if(root.left!=null && root.right!=null){
            temp=min(root.right);
            root.val=temp.val;
            root.right=deleteNode(root.right,root.val);
        }
        else{
            temp=root;
            if(root.left==null){
                root=root.right;
            }
            else if(root.right==null){
                root=root.left;
            }
        }
        return root;
    }
    TreeNode min(TreeNode root){
        if(root!=null){
            while(root.left!=null){
                root=root.left;
            }
        }
       return root;
    }
}