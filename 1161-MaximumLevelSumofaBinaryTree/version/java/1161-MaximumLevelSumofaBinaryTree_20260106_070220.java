// Last updated: 06/01/2026, 07:02:20
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
17    public int maxLevelSum(TreeNode root) {
18        Queue<TreeNode> queue = new LinkedList<>();
19        queue.offer(root);
20
21        int level = 1;
22        int maxLevel = 1;
23        int maxSum = Integer.MIN_VALUE;
24        while (!queue.isEmpty()) {
25            int size = queue.size();
26            int sum = 0;
27            for (int i = 0; i < size; i++) {
28                TreeNode node = queue.poll();
29                sum += node.val;
30                if (node.left != null) queue.offer(node.left);
31                if (node.right != null) queue.offer(node.right);
32            }
33            if (sum > maxSum) {
34                maxSum = sum;
35                maxLevel = level;
36            }
37            level++;
38        }
39        return maxLevel;
40    }
41}
42