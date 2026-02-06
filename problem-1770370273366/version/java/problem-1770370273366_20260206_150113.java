// Last updated: 06/02/2026, 15:01:13
1class RideSharingSystem {
2    Queue<Integer> rider;
3    Queue<Integer> driver;
4
5    public RideSharingSystem() {
6        rider = new LinkedList<>();
7        driver = new LinkedList<>();
8    }
9
10    public void addRider(int riderId) {
11        rider.offer(riderId);
12    }
13
14    public void addDriver(int driverId) {
15        driver.offer(driverId);
16    }
17
18    public int[] matchDriverWithRider() {
19        if (driver.isEmpty() || rider.isEmpty())
20            return new int[] { -1, -1 };
21        int riderId = rider.poll();
22        int driverId = driver.poll();
23        return new int[] { driverId, riderId };
24    }
25
26    public void cancelRider(int riderId) {
27        if (rider.contains(riderId))
28            rider.remove(riderId);
29    }
30}
31
32/**
33 * Your RideSharingSystem object will be instantiated and called as such:
34 * RideSharingSystem obj = new RideSharingSystem();
35 * obj.addRider(riderId);
36 * obj.addDriver(driverId);
37 * int[] param_3 = obj.matchDriverWithRider();
38 * obj.cancelRider(riderId);
39 */