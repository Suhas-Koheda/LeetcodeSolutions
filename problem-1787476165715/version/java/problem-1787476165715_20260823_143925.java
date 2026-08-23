// Last updated: 23/08/2026, 14:39:25
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int max=Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        height(root);
20        return max;
21    }
22    int height(TreeNode root){
23        if (root==null) return 0;
24        int lh=Math.max(0,height(root.left));
25        int rh=Math.max(0,height(root.right));
26        max=Math.max(max,lh+rh+root.val);
27        return Math.max(lh,rh)+root.val;
28    }
29}