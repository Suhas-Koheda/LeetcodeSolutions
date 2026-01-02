// Last updated: 02/01/2026, 10:09:31
class Solution {
    public List<Integer> lexicalOrder(int n) {
        int j = 1;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println(j);
            l.add(j);
            if (j * 10 <= n) {
                j = j * 10;
            } else {
                while (j % 10 == 9 || j >= n) {
                    j /= 10;
                }
                j++;
            }
        }
        return l;
    }
}