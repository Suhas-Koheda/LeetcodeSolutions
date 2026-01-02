// Last updated: 02/01/2026, 10:07:40
class Solution {
    public int nextBeautifulNumber(int n) {
        n=n+1;
        while (check(n) == false && n < 10000000) {
            n++;
        }
        return n;
    }

    boolean check(int n) {
        int freq[] = new int[10];
        for (char i : Integer.toString(n).toCharArray()) {
            int x = Integer.parseInt(Character.toString(i));
            freq[x]++;
        }
        for (int i = 1; i < 10; i++) {
            if (freq[i] > 0 && i != freq[i])
                return false;
        }
        if (freq[0] > 0) {
            return false;
        }
        return true;
    }
}