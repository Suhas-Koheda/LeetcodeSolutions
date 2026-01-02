// Last updated: 02/01/2026, 10:07:22
import java.util.List;

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] chars = s.toCharArray();
int[] prefixSum = new int[s.length() + 1];

for (int[] shift : shifts) {
    int direction = shift[2] == 1 ? 1 : -1;
    prefixSum[shift[0]] += direction;
    prefixSum[shift[1] + 1] -= direction;
}

int cumulativeSum = 0;
for (int i = 0; i < prefixSum.length - 1; i++) {
    cumulativeSum += prefixSum[i];
    int shiftedChar = ((chars[i] - 'a') + cumulativeSum) % 26;
    if (shiftedChar < 0) shiftedChar += 26;
    chars[i] = (char) ('a' + shiftedChar);
}

return String.valueOf(chars);

    }
}
