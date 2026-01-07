// Last updated: 07/01/2026, 22:16:24
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
17    
18    private long totalSum = 0;
19    private long maxProduct = 0;
20    private static final int MOD = 1_000_000_007;
21    private long getTotalSum(TreeNode root) {
22        if (root == null) return 0;
23        return root.val + getTotalSum(root.left) + getTotalSum(root.right);
24    }
25
26    private long dfs(TreeNode root) {
27        if (root == null) return 0;
28
29        long leftSum  = dfs(root.left);
30        long rightSum = dfs(root.right);
31        long subTreeSum = root.val + leftSum + rightSum;
32
33        long product = subTreeSum * (totalSum - subTreeSum);
34        maxProduct = Math.max(maxProduct, product);
35
36        return subTreeSum;
37    }
38
39    public int maxProduct(TreeNode root) {
40        totalSum = getTotalSum(root); 
41        dfs(root);                    
42        return (int)(maxProduct % MOD);
43    }
44}