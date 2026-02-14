// Last updated: 14/02/2026, 17:54:46
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
17    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
18        List<Integer> l1=build(root1);
19        List<Integer> l2=build(root2);
20        l1.addAll(l2);
21        Collections.sort(l1);
22        return l1;
23    }
24
25    public ArrayList<Integer> build(TreeNode root) {
26        ArrayList<Integer> ans = new ArrayList<>();
27
28        if (root == null)
29            return ans;
30
31        ans.add(root.val);
32        ans.addAll(build(root.left));
33        ans.addAll(build(root.right));
34
35        return ans;
36    }
37}