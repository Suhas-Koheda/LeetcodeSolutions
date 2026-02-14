// Last updated: 14/02/2026, 18:07:23
1class Solution {
2    public boolean canReach(int[] arr, int start) {
3        boolean[] visited = new boolean[arr.length];
4        return dfs(arr, start, visited);
5    }
6    
7    private boolean dfs(int[] arr, int index, boolean[] visited) {
8        if (index < 0 || index >= arr.length) return false;
9        if (visited[index]) return false;
10        if (arr[index] == 0) return true;
11        
12        visited[index] = true;
13        
14        return dfs(arr, index + arr[index], visited) ||
15               dfs(arr, index - arr[index], visited);
16    }
17}
18