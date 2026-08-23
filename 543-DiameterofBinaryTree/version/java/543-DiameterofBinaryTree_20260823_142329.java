// Last updated: 23/08/2026, 14:23:29
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
17    int max=-1;
18    public int diameterOfBinaryTree(TreeNode root) {
19        height(root);
20        return max;
21    }
22    int height(TreeNode node){
23        if(node==null) return 0;
24        int lh=height(node.left);
25        int rh=height(node.right);
26        max=Math.max(max,lh+rh);
27        return 1+Math.max(lh,rh);
28    }
29}