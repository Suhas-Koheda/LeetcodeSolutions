// Last updated: 02/01/2026, 10:07:14
class Solution {

    public int bestClosingTime(String customers) {
        int lowestScore = 0;
        int score = 0;
        int bestHour = 0;

        for (int idx = 0; idx < customers.length(); idx++) {
            char c = customers.charAt(idx);

            if (c == 'Y') {
                score--;
            } else {
                score++;
            }

            if (score < lowestScore) {
                lowestScore = score;
                bestHour = idx + 1;
            }
        }

        return bestHour;
    }
}
