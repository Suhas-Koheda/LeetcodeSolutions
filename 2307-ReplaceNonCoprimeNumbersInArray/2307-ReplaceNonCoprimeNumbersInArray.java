// Last updated: 02/01/2026, 10:07:31
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for (int i : nums) {
            s.push(i);
            while (s.size() > 1) {
                int x = s.pop();
                int y = s.pop();
                int z = gcd(x, y);
                if (z > 1)
                    s.push(lcm(x, y));
                else {
                    s.push(y);
                    s.push(x);
                    break;
                }
            }
        }
        while (!s.isEmpty())
            ans.add(s.pop());
        Collections.reverse(ans);
        return ans;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (int) ((1L * a * b) / gcd);
    }
}