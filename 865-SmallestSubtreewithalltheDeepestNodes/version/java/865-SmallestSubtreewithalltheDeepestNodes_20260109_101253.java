// Last updated: 09/01/2026, 10:12:53
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
17    public TreeNode subtreeWithAllDeepest(TreeNode root) {
18        depth(root, 0);
19        return LCA(root);
20    }
21    Map<Integer, Integer> mp = new HashMap<>();
22    int maxD = 0;
23
24    TreeNode LCA(TreeNode root) {
25        if (root == null || mp.getOrDefault(root.val, -1) == maxD) {
26            return root;
27        }
28
29        TreeNode l = LCA(root.left);
30        TreeNode r = LCA(root.right);
31
32        if (l != null && r != null) {
33            return root;
34        }
35
36        return l != null ? l : r;
37    }
38
39    void depth(TreeNode root, int d) {
40        if (root == null) {
41            return;
42        }
43
44        maxD = Math.max(maxD, d);
45        mp.put(root.val, d);
46        depth(root.left, d + 1);
47        depth(root.right, d + 1);
48    }   
49}