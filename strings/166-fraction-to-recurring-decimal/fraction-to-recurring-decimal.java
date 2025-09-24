class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0)
            return "0";
        StringBuilder s = new StringBuilder();
        long div = Math.abs(Long.valueOf(numerator));
        long dis = Math.abs(Long.valueOf(denominator));
        boolean negative = (numerator < 0) ^ (denominator < 0);
        if (negative) {
            s.append("-");
        }
        s.append(div / dis);
        long rem = div % dis;
        if (rem == 0)
            return s.toString();
        s.append(".");
        Map<Long, Integer> h = new HashMap<>();
        while (rem != 0) {
            if (h.containsKey(rem)) {
                s.insert(h.get(rem), "(");
                s.append(")");
                break;
            }
            h.put(rem, s.length());
            rem = rem * 10;
            s.append(rem / dis);
            rem = rem % dis;
        }
        return s.toString();
    }
}