// Last updated: 24/07/2026, 21:20:39
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
17    int ans=0;
18    public int countDominantNodes(TreeNode root) {
19        solve(root);
20        return ans;
21    }
22    public int solve(TreeNode node){
23        if(node==null)return Integer.MIN_VALUE;
24        int leftMax=solve(node.left);
25        int rightMax=solve(node.right);
26        if(node.val>=leftMax && node.val>=rightMax){
27            ans++;
28        }
29        return Math.max(node.val,Math.max(leftMax,rightMax));
30    }
31}