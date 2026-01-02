// Last updated: 02/01/2026, 10:09:02
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int m = flights.length;
        for (int i = 0; i < m; i++) {
            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }

        PriorityQueue<Tuple> q = new PriorityQueue<Tuple>((a,b)->a.stops-b.stops);

        q.add(new Tuple(0, src, 0));

        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = 999999;
        }
        dist[src] = 0;
        while (!q.isEmpty()) {
            Tuple rm = q.poll();
            int stops = rm.stops;
            int node = rm.node;
            int cost = rm.cost;
            if (stops > k)
                continue;
            for (Pair i : adj.get(node)) {
                int adjNode = i.first;
                int adjW = i.second;
                if(cost+adjW<dist[adjNode] && stops<=k){
                    dist[adjNode]=cost+adjW;
                    q.add(new Tuple(stops + 1, adjNode, cost + adjW)); 
                }
            }
        }
        if(dist[dst] == 999999) return -1; 
        return dist[dst]; 
    }
}

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Tuple {
    int stops, node, cost;

    Tuple(int stops, int node, int cost) {
        this.stops = stops;
        this.node = node;
        this.cost = cost;
    }
}