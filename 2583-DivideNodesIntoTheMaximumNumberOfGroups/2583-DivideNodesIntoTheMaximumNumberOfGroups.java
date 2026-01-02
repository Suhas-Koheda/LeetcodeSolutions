// Last updated: 02/01/2026, 10:07:13
class Solution {
    public int magnificentSets(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjacencyList.get(edge[0] - 1).add(edge[1] - 1);
            adjacencyList.get(edge[1] - 1).add(edge[0] - 1);
        }

        int[] colors = new int[n];
        for (int node = 0; node < n; node++) {
            if (colors[node] != 0) continue;
            colors[node] = 1;
            if (!isBipartite(adjacencyList, node, colors)) return -1;
        }

        int[] distances = new int[n];
        for (int node = 0; node < n; node++) {
            distances[node] = calculateMaxDistance(adjacencyList, node, n);
        }

        int maxGroups = 0;
        boolean[] visited = new boolean[n];
        for (int node = 0; node < n; node++) {
            if (visited[node]) continue;
            maxGroups += findMaxGroups(adjacencyList, node, distances, visited);
        }
        return maxGroups;
    }

    private boolean isBipartite(ArrayList<ArrayList<Integer>> adjacencyList, int node, int[] colors) {
        for (int neighbor : adjacencyList.get(node)) {
            if (colors[neighbor] == colors[node]) return false;
            if (colors[neighbor] != 0) continue;
            colors[neighbor] = -colors[node];
            if (!isBipartite(adjacencyList, neighbor, colors)) return false;
        }
        return true;
    }

    private int calculateMaxDistance(ArrayList<ArrayList<Integer>> adjacencyList, int node, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(node);
        visited[node] = true;
        int distance = 0;

        while (!queue.isEmpty()) {
            int nodesInLayer = queue.size();
            for (int i = 0; i < nodesInLayer; i++) {
                int currentNode = queue.poll();
                for (int neighbor : adjacencyList.get(currentNode)) {
                    if (visited[neighbor]) continue;
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
            distance++;
        }
        return distance;
    }

    private int findMaxGroups(ArrayList<ArrayList<Integer>> adjacencyList, int node, int[] distances, boolean[] visited) {
        int maxGroups = distances[node];
        visited[node] = true;

        for (int neighbor : adjacencyList.get(node)) {
            if (visited[neighbor]) continue;
            maxGroups = Math.max(maxGroups, findMaxGroups(adjacencyList, neighbor, distances, visited));
        }
        return maxGroups;
    }
}
