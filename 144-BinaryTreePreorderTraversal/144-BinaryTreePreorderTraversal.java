// Last updated: 02/01/2026, 10:09:55
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> wraplist=new ArrayList<Integer>();
        if(root==null){
             return wraplist;
        }
        Stack<TreeNode> st=new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            wraplist.add(root.val);
            if(root.right !=null){
                st.push(root.right);
            }
            if(root.left !=null){
                st.push(root.left);
            }
        }
        return wraplist;
    }
}