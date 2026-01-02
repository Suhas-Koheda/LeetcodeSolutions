// Last updated: 02/01/2026, 10:07:48
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int[][] indexedTimes = new int[n][3];
        for (int i = 0; i < n; i++) {
            indexedTimes[i][0] = times[i][0];
            indexedTimes[i][1] = times[i][1];
            indexedTimes[i][2] = i;
        }

        Arrays.sort(indexedTimes, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.offer(i);
        }

        PriorityQueue<int[]> occupiedChairs = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            int arrival = indexedTimes[i][0];
            int leaving = indexedTimes[i][1];
            int friend = indexedTimes[i][2];

            while (!occupiedChairs.isEmpty() && occupiedChairs.peek()[0] <= arrival) {
                availableChairs.offer(occupiedChairs.poll()[1]);
            }

            int chair = availableChairs.poll();

            if (friend == targetFriend) {
                return chair;
            }

            occupiedChairs.offer(new int[]{leaving, chair});
        }

        return -1;
    }
}
