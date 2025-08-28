class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int count = 1;
        if (!wordList.contains(endWord)) {
            return 0;
        }
        HashSet<String> arr = new HashSet<>();
        arr.add(beginWord);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String m = q.poll();
                for (String s : wordList) {
                    if (!arr.contains(s) && checkIfDiff(s, m)) {
                        if (s.equals(endWord)) {
                            return count + 1;
                        }
                        q.add(s);
                        arr.add(s);
                    }
                }
            }
            count++;
        }
        return 0;
    }

    boolean checkIfDiff(String s, String k) {
        if (s.length() != k.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != k.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return count == 1;
    }
}