// Last updated: 02/01/2026, 10:35:56
1import java.util.TreeSet;
2
3class ExamRoom {
4    int n;
5    TreeSet<Integer> seats;
6
7    public ExamRoom(int n) {
8        this.n = n;
9        seats = new TreeSet<>();
10    }
11
12    public int seat() {
13        if (seats.isEmpty()) {
14            seats.add(0);
15            return 0;
16        }
17
18        int dist = seats.first();
19        int seat = 0;
20
21        Integer prev = null;
22        for (int s : seats) {
23            if (prev != null) {
24                int d = (s - prev) / 2;
25                if (d > dist) {
26                    dist = d;
27                    seat = prev + d;
28                }
29            }
30            prev = s;
31        }
32
33        if (n - 1 - seats.last() > dist) {
34            seat = n - 1;
35        }
36
37        seats.add(seat);
38        return seat;
39    }
40
41    public void leave(int p) {
42        seats.remove(p);
43    }
44}
45