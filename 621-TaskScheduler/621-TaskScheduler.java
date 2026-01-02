// Last updated: 02/01/2026, 10:09:14
class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Data> pq = new PriorityQueue<>((a, b) -> b.val - a.val);
        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.add(new Data(freq[i], (char) (i + 'A')));
            }
        }
        Queue<Cooldown> q = new LinkedList<>();
        int time = 0;
        while (!pq.isEmpty() || !q.isEmpty()) {
            time++;
            if (!q.isEmpty() && q.peek().ready == time) {
                Data cooled = q.poll().task;
                pq.offer(cooled);
            }
            if (!pq.isEmpty()) {
                Data curr = pq.poll();
                curr.val--;
                if (curr.val > 0) {
                    q.offer(new Cooldown(curr, time + n+1));
                }
            }
        }
        return time;
    }
}

class Data {
    int val;
    char ch;

    public Data(int val, char ch) {
        this.val = val;
        this.ch = ch;
    }
}

class Cooldown {
    Data task;
    int ready;

    public Cooldown(Data task, int ready) {
        this.task = task;
        this.ready = ready;
    }
}