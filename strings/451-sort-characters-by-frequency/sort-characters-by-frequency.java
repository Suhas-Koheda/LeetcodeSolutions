class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        PriorityQueue<Pair> p = new PriorityQueue<Pair>((a, b) -> b.freq - a.freq);
        for (char i : s.toCharArray()) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        for (char i : h.keySet()) {
            p.add(new Pair(i, h.get(i)));
        }
        StringBuilder s1 = new StringBuilder();
        while(!p.isEmpty()){
            Pair p1=p.poll();
            for (int i = 0; i < p1.freq; i++) {
                s1.append(p1.c);
            }
        }
        return s1.toString();
    }
}

class Pair {
    char c;
    int freq;

    public Pair(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }
}